package org.bwf.study.service;

import org.bwf.obj.bo.UserLoginBO;
import org.bwf.obj.bo.UserRegisterBO;

public interface UsersService {
    // 就是方法的签名
    // 返回值和参数

    Integer Register(UserRegisterBO bo);

    String Login(UserLoginBO bo);
}
