package com.santander.spring.Domain;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }
}


