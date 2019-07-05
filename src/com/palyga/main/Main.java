package com.palyga.main;
import com.palyga.input_output.Data;
import com.palyga.сalculation.Calculation;

public class Main {

    public static void main(String[] args) throws ArithmeticException {

        Data i;
        do {

            Calculation calc = new Calculation();
            i = new Data(calc);
            i.readInput1();
            i.readInput2();
            i.readInput3();
            i.returnOutput();
            i.readInput4();
        }
        while (i.endOfProgram != '1');
    }
}
