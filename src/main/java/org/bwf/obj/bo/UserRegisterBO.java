package org.bwf.obj.bo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class UserRegisterBO {
    @NotBlank
    @Pattern(regexp = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$", message = "用户名格式非法")
    private String userLoginName;
    private String userLoginPass;
    private String userNickName;
    private String userPhone;
    private String valCode;

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserLoginPass() {
        return userLoginPass;
    }

    public void setUserLoginPass(String userLoginPass) {
        this.userLoginPass = userLoginPass;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getValCode() {
        return valCode;
    }

    public void setValCode(String valCode) {
        this.valCode = valCode;
    }
}
