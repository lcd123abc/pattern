package com.lcd.pattern.composite;

public class VideoFile extends AbstractFile{
    private String name;

    public VideoFile(String name) {
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
        System.out.println("-----对音频文件"+name + "进行杀毒-----");
    }
}
