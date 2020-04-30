package com.lcd.pattern.command;

//加法类
public class Adder {
  private int num = 0;

  public int add(int value){
    num += value;
    return num;
  }
}
