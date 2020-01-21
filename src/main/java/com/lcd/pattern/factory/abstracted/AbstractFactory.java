package com.lcd.pattern.factory.abstracted;

import com.lcd.pattern.model.Mike;
import com.lcd.pattern.model.PureMike;
import com.lcd.pattern.model.Yoghurt;

public abstract class AbstractFactory {
    abstract PureMike produceMike();
    abstract Yoghurt produceYoghurt();
}
