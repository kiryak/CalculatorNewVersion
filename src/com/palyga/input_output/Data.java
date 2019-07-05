package com.palyga.input_output;

import com.palyga.arithmetics.ArithmeticOperation;
import com.palyga.сalculation.Calculation;

import java.math.BigDecimal;
import java.util.Scanner;

public class Data {
    static BigDecimal a = new BigDecimal(0.00);
    static BigDecimal b = new BigDecimal(0.00);
    public static char inputOperator = ' ';
    public static char endOfProgram = ' ';
    Calculation calculation = new Calculation();

    public Data(Calculation calculation){
        this.calculation = calculation;
    }

    public BigDecimal readInput1 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        if (scanner.hasNextBigDecimal()){
            a = scanner.nextBigDecimal();
        } else {
            System.out.println("Неверный ввод. Введите число.");
            readInput1();
        }
        return a;}

    public BigDecimal readInput2 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите второе число");
        if (scanner.hasNextBigDecimal()){
            b = scanner.nextBigDecimal();
        } else {
            System.out.println("Неверный ввод. Введите число.");
            readInput2();
        }
        return b;}

    public char readInput3 (){
        Scanner scanner = new Scanner (System.in);
        String operatorInput = " ";
        System.out.println("Введите операцию, которую хотите выполнить");
        if (scanner.hasNext()){
            operatorInput = scanner.nextLine();
            inputOperator = operatorInput.charAt(0);
        }
        return inputOperator;
    }

    public char readInput4 (){
        Scanner scanner = new Scanner(System.in);
        String end = " ";
        System.out.println("Нажмите клавишу 1, если хотите завершить работу калькулятора.");
        System.out.println("Нажмите любую другую клавишу если хотите продолжить.");
        if (scanner.hasNext()){
            end = scanner.nextLine();
            endOfProgram = end.charAt(0);
        }
        return endOfProgram;
    }

    public void returnOutput (){
        System.out.print("Результат: ");
        ArithmeticOperation operator = calculation.instance(inputOperator);
if (operator != null) {
    System.out.println(operator.calculation(a,b));
}
}}

