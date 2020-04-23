package com.lcd.pattern.strategy.model;

import com.lcd.pattern.strategy.interfaces.Payment;

public class WeChatPay implements Payment {
    @Override
    public PayState pay(String id, double amount) {
        System.out.println("欢迎使用微信支付");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200,"支付成功",amount);
    }
}
