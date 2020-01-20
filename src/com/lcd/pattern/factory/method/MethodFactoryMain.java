package com.lcd.pattern.factory.method;

/**
 * 工厂方法模式，又称工厂模式，将工厂抽象出来。
 */
public class MethodFactoryMain {
    public static void main(String[] args) {
        Factory teLunSuFactory = new TeLunSuFactory();
        Factory mengNiuFactory = new MengNiuFactory();
        Factory yiLiFactory = new YiLiFactory();
        System.out.println(teLunSuFactory.produceMike().getName());
        System.out.println(mengNiuFactory.produceMike().getName());
        System.out.println(yiLiFactory.produceMike().getName());
    }
}
