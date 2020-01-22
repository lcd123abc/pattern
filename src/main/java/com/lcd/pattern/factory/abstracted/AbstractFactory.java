package com.lcd.pattern.factory.abstracted;

import com.lcd.pattern.factory.model.PureMike;
import com.lcd.pattern.factory.model.Yoghurt;

public abstract class AbstractFactory {
    abstract PureMike produceMike();
    abstract Yoghurt produceYoghurt();
}
