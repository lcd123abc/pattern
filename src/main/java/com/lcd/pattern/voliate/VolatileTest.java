package com.lcd.pattern.voliate;

/**
 * 不添加volatile AAA线程改了data.num的值，main线程不能感知得到，会一直在循环中阻塞
 * 添加volatile，main线程能感知到AAA修改后的num的值
 */
public class VolatileTest {
    static class MyData {
        int num = 0;
        public void addTo60(){
            this.num += 60;
        }
    }
    public static void main(String[] args) {
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
