package com.lcd.pattern.factory.method;

import com.lcd.pattern.model.Mike;
import com.lcd.pattern.model.TeLunSu;

public class TeLunSuFactory implements Factory {
    @Override
    public Mike produceMike() {
        return new TeLunSu();
    }
}
