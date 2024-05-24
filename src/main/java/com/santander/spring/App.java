package com.santander.spring;

import com.santander.spring.Domain.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {

    @Autowired
    private Calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        Calculator calculator = new Calculator();
        System.out.println("\n"+calculator.sum(10, 20));
    }
}



