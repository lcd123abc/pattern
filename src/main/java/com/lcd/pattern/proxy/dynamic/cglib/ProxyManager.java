package com.lcd.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class ProxyManager implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(method.getName().equals("deCode")){
            System.out.println("使用cglib增强了写代码能力");
            Object obj = methodProxy.invokeSuper(o,objects);
            System.out.println("增强完毕！代码已完成");
            return obj;
        }
        if(method.getName().equals("deBug")){
            System.out.println("使用cglib增强了debug能力");
            Object obj = methodProxy.invokeSuper(o,objects);
            System.out.println("增强完毕！debug已完成,bug已解决");
            return obj;
        }
        return null;
    }
}
