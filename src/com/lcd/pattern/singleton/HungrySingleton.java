package com.lcd.pattern.singleton;


import java.io.ObjectStreamException;

/**
 * 单例模式-饿汉式
 * 没有线程安全问题，一开始就创建，容易产生垃圾
 */
public class HungrySingleton {
    //私有化构造函数
    private HungrySingleton(){}
    //静态变量，类一加载就初始化
    private final static HungrySingleton SINGLETON = new HungrySingleton();
    /*
     * 提供一个可以返回实例的方法
     */
    public static HungrySingleton getInstance(){
        return SINGLETON;
    }

    /**
     * 实现此方法，保证序列化后，反序列化的对象是同一个对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return SINGLETON;
    }
}
