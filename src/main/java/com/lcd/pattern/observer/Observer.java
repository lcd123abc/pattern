package com.lcd.pattern.observer;

public interface Observer {
    String getName();
    void setName(String name);
    void help();               // 声明支援盟友的方法
    void beAttacked(AllyControlCenter acc);         // 声明遭到攻击的方法
}
