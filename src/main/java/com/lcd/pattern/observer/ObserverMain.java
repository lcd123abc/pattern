package com.lcd.pattern.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.add(new ConcreteObserver("观察者1"));
        subject.add(new ConcreteObserver("观察者2"));
        subject.add(new ConcreteObserver("观察者3"));

        subject.notifiedAll();
    }
}
