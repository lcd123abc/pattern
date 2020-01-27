package com.lcd.pattern.delegate;

/**
 * 工作是解码
 */
public class EmployeeB implements Job{
    @Override
    public void doing(String command){
        System.out.println("我是员工B,我正在做" + command + "的工作");
    }
}
