package com.lcd.pattern.decorator;

import com.lcd.pattern.adapter.ISignInService;
import com.lcd.pattern.adapter.ResultMsg;

public interface ThirdLoginService extends ISignInService {
    ResultMsg QQLogin(String token);
    ResultMsg WeChatLogin(String token);
}
