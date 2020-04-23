package com.lcd.pattern.strategy.interfaces;

import com.lcd.pattern.strategy.model.PayState;

public interface Payment {
    PayState pay(String id, double amount);
}
