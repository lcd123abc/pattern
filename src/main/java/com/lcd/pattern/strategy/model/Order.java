package com.lcd.pattern.strategy.model;

public class Order {
    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(PayType paytype){
        return paytype.get().pay(this.orderId,this.amount);
    }
}
