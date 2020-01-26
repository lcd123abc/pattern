package com.lcd.pattern.strategy.model;

import com.lcd.pattern.strategy.interfaces.Payment;

public enum PayType {
    ALI_PAY(new ALiPay()),WECHAT_PAY(new WeChatPay()),JINGDONG_PAY(new JinDongPay());

    private Payment payment;
    PayType(Payment payment){
        this.payment = payment;
    }
    public Payment get(){
        return payment;
    }
}
