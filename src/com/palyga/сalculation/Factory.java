package com.palyga.сalculation;

import com.palyga.arithmetics.ArithmeticOperation;

public interface Factory {
    ArithmeticOperation instance (char operator);
}
