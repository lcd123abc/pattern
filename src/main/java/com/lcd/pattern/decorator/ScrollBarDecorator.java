package com.lcd.pattern.decorator;

public class ScrollBarDecorator extends ComponentDecorator{
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构件增加滚动条！");
    }
}
