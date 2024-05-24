package com.santander.spring;

import com.santander.spring.Domain.Calculator;
import com.santander.spring.Domain.InternMail.EmailSystem;
import com.santander.spring.Domain.Phonebook;
import com.santander.spring.Domain.ViaCep.Cep;
import com.santander.spring.Domain.ViaCep.ConversorJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {

    @Autowired
    private Calculator calculator;
    @Autowired
    private ConversorJson conversor;
    @Autowired
    private Phonebook phonebook;
    @Autowired
    private EmailSystem emailSystem;

    @Override
    public void run(String... args) throws Exception {
        String json = "{\"cep\": \"12345\", \"log\": \"Logan Sergey\", \"local\": \"sp\"}";
        Cep response = conversor.convert(json);
        System.out.println("\n\nCep data: " + response);

        System.out.println("\nCalculator Sum: " + calculator.sum(10, 115.8));

        phonebook.addPhone("Juan Melian", "1227182781");
        phonebook.addPhone("JP", "1227182781");
        System.out.println("\n" + phonebook);

        // email system
        System.out.println("\n");
        emailSystem.sendConfirmation();
        emailSystem.sendWelcome();
        emailSystem.sendConfirmation();
    }
}




