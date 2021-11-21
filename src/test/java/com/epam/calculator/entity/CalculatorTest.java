package com.epam.calculator.entity;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.add(2, 3);

        //then
        Assert.assertEquals(5, result, 0);
    }

    @Test
    public void testShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.add(-2, -3);

        //then
        Assert.assertEquals(-5, result, 0);
    }

    @Test
    public void testShouldSubtractWhenSecondNumberPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.subtract(2, 3);

        //then
        Assert.assertEquals(-1, result, 0);
    }

    @Test
    public void testShouldSubtractWhenSecondNumberNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.subtract(2, -3);

        //then
        Assert.assertEquals(5, result, 0);
    }

    @Test
    public void testShouldMultipleWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.multiply(2, 3);

        //then
        Assert.assertEquals(6, result, 0);
    }

    @Test
    public void testShouldMultipleWhenSecondNumberNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.multiply(2, -3);

        //then
        Assert.assertEquals(-6, result, 0);
    }

    @Test
    public void testShouldDivideWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(3, 2);

        //then
        Assert.assertEquals(1.5, result, 0);
    }

    @Test
    public void testShouldDivideWhenSecondNumberNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(3, -2);

        //then
        Assert.assertEquals(-1.5, result, 0);
    }
}
