package com.lcd.pattern.decorator;

public class BlackBorderDecorator extends ComponentDecorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }

    public void setBlackBorder(){
        System.out.println("为构建设置黑色边框");
    }
}
