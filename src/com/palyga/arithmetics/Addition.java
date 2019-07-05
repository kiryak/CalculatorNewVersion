package com.palyga.arithmetics;

import java.math.BigDecimal;

public class Addition implements ArithmeticOperation {
    @Override
    public BigDecimal calculation (BigDecimal a,BigDecimal b ){
        return a.add(b);
    }
}
