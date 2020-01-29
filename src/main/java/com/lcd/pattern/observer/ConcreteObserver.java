package com.lcd.pattern.observer;

public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void react() {
        System.out.println(this.name + "根据目标对象做出反应");
    }
}
