package org.bwf.study.controller;

import org.bwf.obj.bo.UserLoginBO;
import org.bwf.obj.bo.UserRegisterBO;
import org.bwf.study.service.UsersService;
import org.bwf.study.util.returnInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users/")
public class UserController {

    @Autowired
    private UsersService usersService;

    // 添加的动词PUT
    @PutMapping
    public Integer Register(@Validated UserRegisterBO bo ){
        return usersService.Register(bo);
    }

    @PostMapping
    public returnInfo Login(UserLoginBO bo){
//        returnInfo returnInfo = new returnInfo();
//        String result = usersService.Login(bo);
//        if (result == null){
//            returnInfo.setCode(404);
//            returnInfo.setMsg("登陆失败");
//        }else{
//            returnInfo.setCode(200);
//            returnInfo.setMsg("登陆成功");
//        }
//        returnInfo.setData(result);
        returnInfo returnInfo = new returnInfo(usersService.Login(bo));
        return returnInfo;
    }
}
