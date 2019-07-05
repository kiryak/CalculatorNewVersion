package com.palyga.arithmetics;

import com.palyga.arithmetics.ArithmeticOperation;

import java.math.BigDecimal;


public class Multiplication implements ArithmeticOperation {
    @Override
    public BigDecimal calculation (BigDecimal a, BigDecimal b ){
        return a.multiply(b);
}}

