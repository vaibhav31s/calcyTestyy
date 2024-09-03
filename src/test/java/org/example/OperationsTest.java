package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
  Operations operations = new Operations();

  @Test
  @DisplayName("Test to Check addition of Two numbers")
  public void testAddition() {
    assertEquals(5, operations.addition(2, 3));
  }

  @Test
  public void testToAddNegativeNumbers() {
    assertEquals(-10, operations.addition(-5, -5));
  }
  @Test
  @DisplayName("Test to Check subtraction of Two numbers")
  public void testSubtraction() {
    assertEquals(-1, operations.subtraction(2, 3));
  }

  @Test
  @DisplayName("Test to Check multiplication of Two numbers")
  public void testMultiplication() {
    assertEquals(6, operations.multiplication(2, 3));
  }

  @Test
  @DisplayName(("Test to check number being multiplied by 0"))
  public void testMultiplicationByZero() {
    assertEquals(0, operations.multiplication(0, 10));
  }

  @Test
  @DisplayName("Test to Check Division of Two numbers")
  public void testDivision() {
    assertEquals(0, operations.division(2, 3));
  }

}