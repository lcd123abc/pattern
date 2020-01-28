package com.lcd.pattern.adapter;

public interface ISignInService {
    ResultMsg signIn(String username,String password);
    ResultMsg login(String username,String password);
}
