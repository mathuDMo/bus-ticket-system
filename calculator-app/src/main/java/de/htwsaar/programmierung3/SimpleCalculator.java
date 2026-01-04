package de.htwsaar.programmierung3;

public class SimpleCalculator {
  
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division by zero is not allowed.");
    }
    return a / b;
  }

  public int multiply(int number1, int number2) {
     return number1 * number2;
  }

  public double squareRoot(double number) {
    return Math.sqrt(number);
  }

}
