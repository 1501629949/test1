package org.bwf.study.model;

public class UserInfo {
    private Integer userId;

    private String userLoginName;

    private String userLoginPass;

    private String userNickName;

    private String userPhone;

    private String userEmail;

    private Byte userEnable;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getUserLoginPass() {
        return userLoginPass;
    }

    public void setUserLoginPass(String userLoginPass) {
        this.userLoginPass = userLoginPass == null ? null : userLoginPass.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Byte getUserEnable() {
        return userEnable;
    }

    public void setUserEnable(Byte userEnable) {
        this.userEnable = userEnable;
    }
}