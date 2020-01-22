package com.lcd.pattern.proxy.dynamic;

import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DeveloperProxy {

    public static Developer getProxy(JavaCoder javaCoder){
        /*
          最后的参数是 InvocationHandler,用lambda表达式写匿名内部类
         */
        Developer developer = (Developer)Proxy.newProxyInstance(javaCoder.getClass().getClassLoader(),
                javaCoder.getClass().getInterfaces(), (proxy, method, args) -> {
                    if(method.getName().equals("deCode")){
                        System.out.println("写代码前祈祷一下");
                        method.invoke(javaCoder,args);
                        System.out.println("哇，运行居然没bug");
                    }
                    if(method.getName().equals("deBug")){
                        System.out.println("调bug前祈祷一下");
                        method.invoke(javaCoder,args);
                        System.out.println("小问题，不是大事");
                    }
                    return null;
                });
        return developer;
    }
}
