package com.lcd.pattern.delegate;

/**
 * 工作是加密
 */
public class EmployeeA implements Job{
    @Override
    public void doing(String command){
        System.out.println("我是员工A,我正在做" + command + "的工作");
    }
}
