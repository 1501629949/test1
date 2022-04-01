package org.bwf.study.service.impl;

import org.bwf.obj.bo.UserLoginBO;
import org.bwf.obj.bo.UserRegisterBO;
import org.bwf.study.dao.UserInfoMapper;
import org.bwf.study.model.UserInfo;
import org.bwf.study.model.UserInfoExample;
import org.bwf.study.service.UsersService;
import org.bwf.study.util.JwtUtils;
import org.bwf.study.util.MD5;
import org.bwf.study.util.RedisUntil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private RedisUntil redisUntil;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public Integer Register(UserRegisterBO bo) {
        // 验证bo中的参数是否合法  自动模型验证
        // bo应该要携带验证码的 扩展属性 valCode
        // 如何验证valCode的有效性 ？？
        // valCode首先要在某一个地方进行生成，然后通过短信发送到用户手机，并且把valCode写入Redis

        //获取Redis当中的valCode
        String key = String.format("Register-%s", bo.getUserLoginName());
        Object obj = redisUntil.get(key);
        //判断obj是否为空
        if (obj == null) {
            System.out.println("验证码为空......");
            return null;
        }
        ;
        // 判断验证码  valCode是否有效
        if (!bo.getValCode().equals(String.valueOf(obj))) {
            System.out.println("验证码非法.....");
            return null;
        }

        // 注册业务
        // 判断数据库是否有重名  查询数据库
        // 只要用到查询，不是根据id查询的，就要使用example
        UserInfoExample userInfoExample = new UserInfoExample();
        // 累加where条件
        // 通过example对象创建 where条件筛选对象  criteria
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        // 就是累加了一个根据用户登录名寻找的 where 条件
        criteria.andUserLoginNameEqualTo(bo.getUserLoginName());
        // 根据组件好的example去查询数据库
        // 得到一个用户列表集合
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        if (userInfoList.size() > 0) {
            System.out.println("用户名已经存在......");
            return null;
        }

        // 把数据插入数据库
        MD5 md5 = new MD5();
        UserInfo userInfo = new UserInfo();
        userInfo.setUserLoginName(bo.getUserLoginName());
        // 先把密码加盐，再MD5
        String pass = md5.md5(bo.getUserLoginPass() + bo.getUserNickName());
        userInfo.setUserLoginPass(pass);
        userInfo.setUserNickName(bo.getUserNickName());
        userInfo.setUserPhone(bo.getUserLoginName());
        userInfo.setUserEnable((byte) 1);

        int result = userInfoMapper.insert(userInfo);
        if (result <= 0) {
            System.out.println("数据插入失败");
            return null;
        }

        return 1;
    }

    @Override
    public String Login(UserLoginBO bo) {
        // 只要是查询，不是根据id查询，就要用到  Example
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        // 登录查询只根据用户名进行查询
        criteria.andUserLoginNameEqualTo(bo.getUserLoginName());
        // 获得数据
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        if (userInfoList.size() <= 0) {
            System.out.println("用户名非法.....");
            return null;
        }
        // 这就是根据用户名查到的用户实体信息
        UserInfo userInfo = userInfoList.get(0);
        // 验证密码
        MD5 md5 = new MD5();
        String boPass = md5.md5(bo.getUserLoginPass() + userInfo.getUserNickName());
        if(!boPass.equals(userInfo.getUserLoginPass())){
            System.out.println("密码非法.....");
            return null;
        }
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userInfo.getUserId());
        String token = JwtUtils.sign(map,3600_000);
        redisUntil.set(token, userInfo, 3600);
//

        return token;
    }
}
