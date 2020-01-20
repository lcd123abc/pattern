package com.lcd.pattern.factory.method;

import com.lcd.pattern.model.MengNiu;
import com.lcd.pattern.model.Mike;
import com.lcd.pattern.model.TeLunSu;

public class MengNiuFactory implements Factory {
    @Override
    public Mike produceMike() {
        return new MengNiu();
    }
}
