package com.lcd.pattern.model;

public class YiLi implements Mike,Cloneable {
    @Override
    public String getName() {
        return "伊利";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
