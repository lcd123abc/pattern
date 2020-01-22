package com.lcd.pattern.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * 也可以通过实现InvocationHandler接口来实现，其实和下面的写法是一样的
 */
public class DeveloperProxy {

    public static Developer getProxy(JavaCoder javaCoder){
        /*
          最后的参数是 InvocationHandler,用lambda表达式写匿名内部类
         */
        Developer developer = (Developer)Proxy.newProxyInstance(javaCoder.getClass().getClassLoader(),
                javaCoder.getClass().getInterfaces(), (proxy, method, args) -> {
                    if(method.getName().equals("deCode")){
                        System.out.println("写代码前祈祷一下");
                        Object obj = method.invoke(javaCoder,args);
                        System.out.println("哇，运行居然没bug");
                        return obj;
                    }
                    if(method.getName().equals("deBug")){
                        System.out.println("调bug前祈祷一下");
                        Object obj = method.invoke(javaCoder,args);
                        System.out.println("小问题，不是大事");
                        return obj;
                    }
                    return null;
                });
        return developer;
    }
}
