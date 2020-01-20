package com.lcd.pattern.factory.method;

import com.lcd.pattern.model.Mike;
import com.lcd.pattern.model.TeLunSu;
import com.lcd.pattern.model.YiLi;

public class YiLiFactory implements Factory {
    @Override
    public Mike produceMike() {
        return new YiLi();
    }
}
