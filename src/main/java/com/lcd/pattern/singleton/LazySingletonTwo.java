package com.lcd.pattern.singleton;

/**
 * 懒汉模式改进版，加上锁，解决了线程安全问题
 */
public class LazySingletonTwo {
    private LazySingletonTwo(){}

    public static volatile LazySingletonTwo SINGLETON;

    public static LazySingletonTwo getInstance(){
        if (SINGLETON == null){
            synchronized (LazySingletonTwo.class){
                if (SINGLETON == null){
                    SINGLETON = new LazySingletonTwo();
                }
            }
        }
        return SINGLETON;
    }
}
