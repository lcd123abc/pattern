package com.lcd.pattern.voliate;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {
    static class MyData {
        int num = 0;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        public void addTo60(){
            this.num += 60;
        }

        public void addOne(){
            num++;
        }

        public void atomicAdd(){
            atomicInteger.incrementAndGet();
        }
    }
    public static void main(String[] args) {
       // checkVolatileVisible();
        checkVolatileUnAtomic();
    }

    /**
     * 验证volatile的非原子性
     * 开启20个线程，每个线程循环加1000次，如果保证了原子性，num预期的结果应该每次都是20000
     * 但是结果并不是，因为++操作不保证原子性
     * 解决方式：原子整型 AtomicInteger
     */
    public static void checkVolatileUnAtomic(){
        MyData myData = new MyData();
        for (int i = 1; i <= 20 ; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 1000 ; j++) {
                    myData.addOne();
                    myData.atomicAdd();
                }
            },String.valueOf(i)).start();
        }

        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "\t finally num value:" + myData.num + "\natomicNum:" +myData.atomicInteger.get());
    }

    /**
     * 验证volatile的可见性
     * 不添加volatile AAA线程改了data.num的值，main线程不能感知得到，会一直在循环中阻塞
     *  添加volatile，main线程能感知到AAA修改后的num的值
     */
    private static void checkVolatileVisible() {
        MyData myData = new MyData();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in" );
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addTo60();
            System.out.println(Thread.currentThread().getName() + "\t mydate.num update num=" + myData.num );
        },"AAA").start();

        while (myData.num == 0){

        }

        System.out.println("main线程，myData.num=" + myData.num);
    }
}
