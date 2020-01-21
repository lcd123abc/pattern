package com.lcd.pattern.singleton;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class SingletonMain {
    public static void main(String[] args) {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(() ->{
                //饿汉模式
                 /* Object instance = HungrySingleton.getInstance();
                System.out.println(System.currentTimeMillis() +" "+ instance);*/
                //懒汉模式
               /* Object instance = LazySingletonOne.getInstance();
                System.out.println(System.currentTimeMillis() +" "+ instance);*/
                //懒汉模式改进版
               /* Object instance = LazySingletonTwo.getInstance();
                System.out.println(System.currentTimeMillis() +" "+ instance);*/
                //静态内部类实现单例
                /*Object instance = InnerClassSingleton.getInstance();
                System.out.println(System.currentTimeMillis() +" "+ instance);*/
                //枚举实现单例
                Object instance = EnumSingleton.INSTANCE.hashCode();
                System.out.println(System.currentTimeMillis() +" "+ instance);
                try {
                    latch.await();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
            latch.countDown();
        }
    }
}
