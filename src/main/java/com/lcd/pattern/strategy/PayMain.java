package com.lcd.pattern.strategy;

import com.lcd.pattern.strategy.model.Order;
import com.lcd.pattern.strategy.model.PayType;

public class PayMain {
    public static void main(String[] args) {
        Order order = new Order("100000001","99999999",520.11);
        System.out.println(order.pay(PayType.JINGDONG_PAY));
    }
}
