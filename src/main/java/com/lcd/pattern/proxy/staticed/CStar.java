package com.lcd.pattern.proxy.staticed;

/**
 * 被代理人
 */
public class CStar implements IStar {
    @Override
    public void sing() {
        System.out.println("明星唱歌");
    }
}
