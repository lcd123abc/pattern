package com.lcd.pattern.factory.method;

import com.lcd.pattern.factory.model.MengNiu;
import com.lcd.pattern.factory.model.Mike;

public class MengNiuFactory implements Factory {
    @Override
    public Mike produceMike() {
        return new MengNiu();
    }
}
