package com.lcd.pattern.composite;

public class ImageFile extends AbstractFile{
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        throw new UnsupportedOperationException("不支持该方法");
    }

    @Override
    public void remove(AbstractFile file) {
        throw new UnsupportedOperationException("不支持该方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        throw new UnsupportedOperationException("不支持该方法");
    }

    @Override
    public void killVirus() {
        System.out.println("-----对图像文件" + name + "进行杀毒----");
    }
}
