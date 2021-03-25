package com.lcd.pattern.factory.simple;

import com.lcd.pattern.factory.model.MengNiu;
import com.lcd.pattern.factory.model.Mike;
import com.lcd.pattern.factory.model.TeLunSu;
import com.lcd.pattern.factory.model.YiLi;

public class MileFactory {
    public static Mike produceMike(String name){
        if("蒙牛".equals(name)){
            return new MengNiu();
        }else if ("特仑苏".equals(name)){
            return new TeLunSu();
        }else if ("伊利".equals(name)){
            return new YiLi();
        }else{
            return null;
        }
    }
}
