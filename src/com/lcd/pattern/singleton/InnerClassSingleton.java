package com.lcd.pattern.singleton;

/**
 * 使用内部类来实现单例模式，非常推荐！
 * 只有第一次调用getInstance方法时，虚拟机才加载 Inner 并初始化instance ，
 * 只有一个线程可以获得对象的初始化锁，其他线程无法进行初始化，保证对象的唯一性。
 * 目前此方式是所有单例模式中最推荐的模式，但具体还是根据项目选择。
 */
public class InnerClassSingleton {
    private InnerClassSingleton(){}

    private static class Inner {
        private static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return Inner.singleton;
    }
}
