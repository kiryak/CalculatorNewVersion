package com.palyga.arithmetics;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division implements ArithmeticOperation {
    BigDecimal result;
    @Override
    public BigDecimal calculation (BigDecimal a, BigDecimal b ) {
        try {
            b.equals(BigDecimal.ZERO);
            result = a.divide(b, 9, RoundingMode.HALF_UP);
        } catch (ArithmeticException byZeroArithmeticException) {
            System.out.println("Операция не может быть выполнена. Деление на ноль");
        }
        return result;
    }
}

