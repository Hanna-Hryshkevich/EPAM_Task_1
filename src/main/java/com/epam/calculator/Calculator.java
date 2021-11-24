package com.epam.calculator;

public class Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int divide(int first, int second) {
        if(first % second == 0){
            return first/second;
        } else {
            return first % second;
        }
    }
}
