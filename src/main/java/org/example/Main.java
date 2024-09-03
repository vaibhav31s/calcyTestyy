package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Calculator cals = new Calculator(new ScannerWrapper(new Scanner(System.in)), new Operations());
    cals.calculate();


  }
}