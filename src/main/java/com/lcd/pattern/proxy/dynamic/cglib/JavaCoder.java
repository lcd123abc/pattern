package com.lcd.pattern.proxy.dynamic.cglib;

import com.lcd.pattern.proxy.dynamic.jdk.Developer;

public class JavaCoder implements Developer {
    @Override
    public void deCode() {
        System.out.println("Java程序员写代码");
    }

    @Override
    public void deBug() {
        System.out.println("Java程序员调Bug");
    }
}
