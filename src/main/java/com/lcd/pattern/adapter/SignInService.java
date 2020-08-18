package com.lcd.pattern.adapter;


public class SignInService implements ISignInService{
    public ResultMsg signIn(String username,String password){
        //注册的逻辑
        //...
        return new ResultMsg(200,"注册成功",null);
    }
    public ResultMsg login(String username,String password){
        //登录的逻辑
        //...
        return new ResultMsg(200,"登录成功",null);
    }
}
