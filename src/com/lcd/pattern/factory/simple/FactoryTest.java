package com.lcd.pattern.factory.simple;

/**
 * 简单工厂模式小案例
 * 缺点：不好拓展，不符合开闭原则
 */
public class FactoryTest {
    public static void main(String[] args) {

        Factory factory = new Factory();
        System.out.println(factory.produceMike("蒙牛").getName());
        System.out.println(factory.produceMike("伊利").getName());
        System.out.println(factory.produceMike("特仑苏").getName());
    }
}
