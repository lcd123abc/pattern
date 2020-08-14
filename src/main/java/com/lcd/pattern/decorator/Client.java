package com.lcd.pattern.decorator;

/**
 * 装饰模式：
 *    装饰者和被装饰着继承同一个抽象父类，装饰者中聚合被装饰者，以达到增加的目的
 */
public class Client {
    public static void main(String[] args) {
        Component component, componentSB; //使用抽象组件定义
        component = new Window();
        componentSB = new ScrollBarDecorator(component); //装饰component
        componentSB.display();
    }
}
