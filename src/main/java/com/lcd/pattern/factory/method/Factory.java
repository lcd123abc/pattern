package com.lcd.pattern.factory.method;

import com.lcd.pattern.factory.model.Mike;

/**
 * 将工厂抽象出来
 */
public interface Factory {
    Mike produceMike();
}
