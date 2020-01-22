package com.lcd.pattern.factory.method;

import com.lcd.pattern.factory.model.Mike;
import com.lcd.pattern.factory.model.TeLunSu;

public class TeLunSuFactory implements Factory {
    @Override
    public Mike produceMike() {
        return new TeLunSu();
    }
}
