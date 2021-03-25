package com.lcd.pattern.singleton;

/**
 * 懒汉模式改进版，加上锁，解决了线程安全问题
 */
public class LazySingletonTwo {
    private LazySingletonTwo(){}

    /**
     * 为什么要加volatile，编译器优化代码会进行指令重排，
     * 那么有极低的概率会发生这种情况：一个线程进入new 过程，进行了内存分配但是还没初始化
     * 第二个线程进行判断，发现有内存地址不为null,直接返回，但是对象还没初始化，所以实际还是null
     */
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
