package com.lcd.pattern.decorator;

import com.lcd.pattern.adapter.SignInService;

/**
 * 装饰者模式，像jdbc的DataSource，IO也是装饰者模式
 */
public class DecoratorMain {
    public static void main(String[] args) {
        ThirdLoginService thirdLoginService = new ThirdLoginServiceImpl(new SignInService());
        thirdLoginService.QQLogin("sadasd");
    }
}
