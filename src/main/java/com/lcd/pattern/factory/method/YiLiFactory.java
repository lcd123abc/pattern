package com.lcd.pattern.factory.method;

import com.lcd.pattern.factory.model.Mike;
import com.lcd.pattern.factory.model.YiLi;

public class YiLiFactory implements Factory {
    @Override
    public Mike produceMike() {
        return new YiLi();
    }
}
