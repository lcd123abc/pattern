package com.lcd.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegisterSingleton {
    private final  static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className){
       if(className == null){
           className = "com.lcd.pattern.factory.model.TeLunSu";
       }
        synchronized (ioc){
            if (ioc.get(className) == null){
                try {
                    Object obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
       return ioc.get(className);
    }
}
