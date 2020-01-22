package com.lcd.pattern.factory.abstracted;

import com.lcd.pattern.factory.model.*;

public class MengNiuFactory extends AbstractFactory {

    @Override
    PureMike produceMike() {
        return new MengNiuPureMike();
    }

    @Override
    Yoghurt produceYoghurt() {
        return new MengNiuYoghurt();
    }
}
