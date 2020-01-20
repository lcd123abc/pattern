package com.lcd.pattern.factory.abstracted;


import com.lcd.pattern.model.*;

public class TeLunSuFactory extends AbstractFactory {

    @Override
    PureMike produceMike() {
        return new TeLunSuPureMike();
    }

    @Override
    Yoghurt produceYoghurt() {
        return new TeLunSuYoghurt();
    }
}
