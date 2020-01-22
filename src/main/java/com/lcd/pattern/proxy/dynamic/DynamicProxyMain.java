package com.lcd.pattern.proxy.dynamic;

public class DynamicProxyMain {
    public static void main(String[] args) {
        JavaCoder coder = new JavaCoder();
        Developer proxy = DeveloperProxy.getProxy(coder);
        proxy.deBug();
        proxy.deCode();
    }
}
