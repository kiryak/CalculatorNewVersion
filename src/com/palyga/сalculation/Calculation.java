package com.palyga.сalculation;

import com.palyga.arithmetics.*;
import com.palyga.input_output.Data;

public class Calculation implements Factory {
    Data input;
    private ArithmeticOperation operation;

    @Override
    public ArithmeticOperation instance (char operator){
        switch (this.input.inputOperator = operator){
            case '+':
                operation = new Addition();
                break;
            case '-':
                operation = new Subtraction();
                break;
            case '*':
                operation = new Multiplication();
                break;
            case '/':
                operation = new Division();
                break;
            default:
                System.out.println("Операция не входит в число допустимых или Вы ввели неверный символ." );
        }

        return operation;

    }
}