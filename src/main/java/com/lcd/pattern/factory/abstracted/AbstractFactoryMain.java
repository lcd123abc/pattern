package com.lcd.pattern.factory.abstracted;

/**
 * 抽象工厂模式案例
 * 抽象工厂模式可以说是工厂模式的优化版本
 * 抽象工厂模式与工厂模式对比起来，有了更好的健壮性和扩展性
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory factory = new MengNiuFactory();
        System.out.println(factory.produceMike().getName());
        System.out.println(factory.produceYoghurt().getYoghurtName());
        factory = new YiLiFactory();
        System.out.println(factory.produceMike().getName());
        System.out.println(factory.produceYoghurt().getYoghurtName());
        factory = new TeLunSuFactory();
        System.out.println(factory.produceMike().getName());
        System.out.println(factory.produceYoghurt().getYoghurtName());
    }
}
