package com.lcd.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements Job{
    private Map<String,Job> jobMap = new HashMap<>();

    public Leader(){
        jobMap.put("加密",new EmployeeA());
        jobMap.put("解码",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        if(command != null){
            jobMap.get(command).doing(command);
        }
    }
}
