package com.lcd.pattern.template;

public class Client {
    public static void main(String[] args) {
        Account account = new CurrentAccount();
        account.handle("张三","123");
    }
}
