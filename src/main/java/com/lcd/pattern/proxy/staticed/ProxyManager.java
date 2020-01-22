package com.lcd.pattern.proxy.staticed;

/**
 * 代理人
 */
public class ProxyManager implements IStar {
    private CStar cStar;

    public ProxyManager(CStar cStar) {
        this.cStar = cStar;
    }

    @Override
    public void sing() {
        System.out.println("开始准备工作");
        cStar.sing();
        System.out.println("唱歌完毕，开始善后工作");
    }
}
