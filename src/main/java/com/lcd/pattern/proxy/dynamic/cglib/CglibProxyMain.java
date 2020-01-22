package com.lcd.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibProxyMain {
    public static void main(String[] args) {
        //定义Enhancer，配置参数，创建代理对象
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(JavaCoder.class);
        enhancer.setCallback(new ProxyManager());
        JavaCoder proxy = (JavaCoder)enhancer.create();

        proxy.deBug();
        proxy.deCode();
    }
}
