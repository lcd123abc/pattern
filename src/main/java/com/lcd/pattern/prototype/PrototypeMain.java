package com.lcd.pattern.prototype;

import com.lcd.pattern.factory.model.YiLi;

/**
 * 原型模式在java最常见的实现就是克隆对象
 * 或者是使用BeanUtils去拷贝对象
 */
public class PrototypeMain {
    public static void main(String[] args) {
        YiLi yiLi = new YiLi();
        try {
            YiLi yiLiClone = (YiLi)yiLi.clone();
            System.out.println(yiLi);
            System.out.println(yiLiClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
