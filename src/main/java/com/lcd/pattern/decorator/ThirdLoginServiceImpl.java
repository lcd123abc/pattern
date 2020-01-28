package com.lcd.pattern.decorator;

import com.lcd.pattern.adapter.ResultMsg;
import com.lcd.pattern.adapter.SignInService;

public class ThirdLoginServiceImpl implements ThirdLoginService {
    private SignInService signInService;

    public ThirdLoginServiceImpl(SignInService signInService) {
        this.signInService = signInService;
    }

    @Override
    public ResultMsg QQLogin(String token) {
        //QQ登录的逻辑
        //...
        ResultMsg resultMsg = signInService.login(token, null);
        return resultMsg;
    }

    @Override
    public ResultMsg WeChatLogin(String token) {
        //WeChat登录的逻辑
        //...
        ResultMsg resultMsg = signInService.login(token, null);
        return resultMsg;
    }

    @Override
    public ResultMsg signIn(String username, String password) {
        return signInService.signIn(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signInService.login(username,password);
    }
}
