package com.lcd.pattern.template;

/**
 * 模拟银行利息结算，模板方法，大概的步骤：
 * 1.登录
 * 2.登录成功后计算利息,失败提示错误
 * 3.然后显示
 */
public abstract class Account {
    public boolean validate(String account, String password){
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        return account.equals("张三") && password.equals("123");
    }

    public abstract void calculateInterest();

    public void display(){
        System.out.println("显示利息!");
    }

    public void handle(String account, String password){
        if (!validate(account, password)){
            System.out.println("账户或密码错误");
            return;
        }
        calculateInterest();
        display();
    }
}
