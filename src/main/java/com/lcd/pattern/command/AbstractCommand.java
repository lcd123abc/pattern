package com.lcd.pattern.command;

public abstract class AbstractCommand {
  public abstract int execute(int value); // 命令执行方法
  public abstract int undo(); // 命令撤销方法
}
