package com.lcd.pattern.delegate;

/**
 * 委托模式和策略模式有点相识
 * 策略模式注重的是扩展，委托模式注重的是内部的灵活性
 */
public class BossMain {
    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.doing("加密");
        leader.doing("解码");
    }
}
