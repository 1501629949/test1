package org.bwf.study.interceptor;

import org.bwf.study.util.RedisUntil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class IdentityInter implements HandlerInterceptor {

    @Resource
    private RedisUntil redisUntil;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj){
        // 拿到请求的token
        // 去redis中使用token作为key去寻找数据
        String token = request.getHeader("Authorization");

        if(token == null || "".equals(token)){
            System.out.println("没有 token ......");
            return false;
        }

        Object objToken = redisUntil.get(token);
        if(objToken == null ) {
            System.out.println("token 无效 ......");
            return false;
        }
        return true;
    }
}
