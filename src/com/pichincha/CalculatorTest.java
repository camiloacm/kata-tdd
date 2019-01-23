package com.pichincha;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calculateEmptyStringTest() {
        int emptyAnswer = calculator.Evaluate("");
        int nullAnswer = calculator.Evaluate(null);

        Assertions.assertEquals(emptyAnswer, 0);
        Assertions.assertEquals(nullAnswer, 0);
    }

    @org.junit.jupiter.api.Test
    void calculateUniqueValueTest() {
        int multipleValueAnswer = calculator.Evaluate("55.2");
        int uniqueValueAnswer = calculator.Evaluate("5");

        Assertions.assertFalse(multipleValueAnswer == 55.2f);
        Assertions.assertTrue(uniqueValueAnswer == 5);
    }
}