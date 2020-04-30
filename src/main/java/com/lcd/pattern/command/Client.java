package com.lcd.pattern.command;

public class Client {
  public static void main(String[] args) {
    CalculatorForm calculatorForm = new CalculatorForm();
    AbstractCommand command = new AddCommand();

    calculatorForm.setCommand(command);
    calculatorForm.compute(10);
    calculatorForm.compute(5);
    calculatorForm.compute(10);
    calculatorForm.undo();
    calculatorForm.undo();
  }
}
