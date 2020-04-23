package com.lcd.pattern.adapter;

public class ResultMsg {
    int code;
    String msg;
    Object Data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        Data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", Data=" + Data +
                '}';
    }
}
