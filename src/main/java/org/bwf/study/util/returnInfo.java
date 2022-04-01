package org.bwf.study.util;

public class returnInfo {
    private String msg;
    private Integer code;
    private Object data;

    public returnInfo(Object o){
        this.data = o;
    }
    public returnInfo () {

    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
