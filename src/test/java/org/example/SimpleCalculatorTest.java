package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    void test_if_calculate_add_is_working() {
        assertEquals(22, calculator.Add(10, 12));
    }

    @Test
    void test_if_calculate_soustraction_is_working() {
        assertEquals(10, calculator.soustraction(20, 10));
    }

    @Test
    void test_if_calculate_multiplication_is_working() {
        assertEquals(200, calculator.multiplication(20, 10));
    }

    @Test
    void test_if_calculate_is__pair() {
        assertTrue(calculator.isEven(10));
        assertFalse(calculator.isEven(11));
    }

}