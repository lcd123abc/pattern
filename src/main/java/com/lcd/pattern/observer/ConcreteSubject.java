package com.lcd.pattern.observer;

public class ConcreteSubject extends Subject{
    @Override
    public void notifiedAll() {
        for (Observer observer : observerList) {
            observer.react();
        }
    }
}
