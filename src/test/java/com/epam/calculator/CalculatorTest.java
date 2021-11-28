package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddShouldAddWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 2);

        //then
        Assert.assertEquals(3, result);
    }
    @Test
    public void testAddShouldAddWhenNumbersNegative(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(-1, -2);

        //then
        Assert.assertEquals(-3, result);
    }
    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtract(1, 2);

        //then
        Assert.assertEquals(-1, result);
    }
    @Test
    public void testSubtractShouldSubtractWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtract(-1, -2);

        //then
        Assert.assertEquals(1, result);
    }
    @Test
    public void testDivideShouldDivideFullPart(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(1, 2);

        //then
        Assert.assertEquals(1, result);
    }
    @Test
    public void testDivideShouldDivideFractionalPart(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(1, 2);

        //then
        Assert.assertEquals(1, result);
    }
}
