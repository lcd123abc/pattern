package com.lcd.pattern.template;

public class CurrentAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息");
    }
}
