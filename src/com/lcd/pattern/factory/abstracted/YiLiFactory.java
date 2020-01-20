package com.lcd.pattern.factory.abstracted;

import com.lcd.pattern.model.*;

public class YiLiFactory extends AbstractFactory {

    @Override
    PureMike produceMike() {
        return new YiLiPureMike();
    }

    @Override
    Yoghurt produceYoghurt() {
        return new YiLiYoghurt();
    }
}
