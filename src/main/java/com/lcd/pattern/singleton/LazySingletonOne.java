package com.lcd.pattern.singleton;

/**
 * v 1.0
 * 懒汉式
 * 用的时候才加载，也就是延时加载
 * 有线程安全问题
 */
public class LazySingletonOne {
    //构造方法私有化
    private LazySingletonOne(){ }

    private static LazySingletonOne SINGLETON;

    /*
     * 提供一个可以返回实例的方法
     */
    public static LazySingletonOne getInstance(){
        if(SINGLETON == null){
            SINGLETON = new LazySingletonOne();
        }
        return SINGLETON;
    }
}
