package com.lcd.pattern.proxy.staticed;

/**
 * 静态代理需要代理人和被代理人实现同样的方法
 * 一般都是实现同样的接口
 * 缺点：因为需要代理类和被代理类实现同样的方法，如果代理类太多
 * 对代理对象和被代理对象的方法难以维护
 */
public class StaticProxyMain {
    public static void main(String[] args) {
        CStar star = new CStar();
        ProxyManager proxy = new ProxyManager(star);
        proxy.sing();
    }
}
