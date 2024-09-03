package org.example;

import java.util.Scanner;

public class ScannerWrapper {
  private Scanner scanner;

  public ScannerWrapper(Scanner scanner) {
    this.scanner = scanner;
  }

  public int nextInt() {
    return scanner.nextInt();
  }

  public String next() {
    return scanner.next();
  }
}
