package org.example;

public class Calculator {
  private ScannerWrapper sc;
  static Operations operations = new Operations();

  public Calculator(ScannerWrapper scanner, Operations ops) {
    sc = scanner;
    operations = ops;
  }

   void calculate() {
    System.out.print("Enter the first number (a): ");
    int a = sc.nextInt();

    System.out.print("Enter the second number (b): ");
    int b = sc.nextInt();

    System.out.print("Enter the operation to perform (add, sub, mul, div): ");
    String operationToPerform = sc.next();
    int result;
      switch (operationToPerform.toLowerCase()) {
        case "add":
          result = operations.addition(a, b);
          break;
        case "sub":
          result = operations.subtraction(a, b);
          break;
        case "mul":
          result = operations.multiplication(a, b);
          break;
        case "div":
          result = operations.division(a, b);
          break;
        default:
          System.out.println("Invalid operation. Please choose from add, sub, mul, div.");
          return;
      }
      System.out.println("Result: " + result);
    }
}

