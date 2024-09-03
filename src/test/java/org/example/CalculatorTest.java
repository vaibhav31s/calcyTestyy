package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;


public class CalculatorTest {

  Operations operations = new Operations();

  @Mock
  private ScannerWrapper mockScanner;

  @Mock
  private Operations mockOperations;

  @InjectMocks
  private Calculator calculator;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    calculator = new Calculator(mockScanner, mockOperations);
  }

  @Test
  public void testAdditionOperation() {
    // Define mock behavior for ScannerWrapper inputs
    when(mockScanner.nextInt()).thenReturn(11, 5); // Mock inputs for a and b
    when(mockScanner.next()).thenReturn("add"); // Mock operation input

    // Define mock behavior for Operations addition
    when(mockOperations.addition(11, 5)).thenReturn(16);

    // Execute the calculate method
    calculator.calculate();

    // Verify the correct method was called on the mock
    verify(mockOperations).addition(11, 5);
  }









}
