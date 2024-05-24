package com.santander.spring;

import com.santander.spring.Domain.ViaCep.Cep;
import com.santander.spring.Domain.ViaCep.ConversorJson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConversorJsonTests {

    @Autowired
    private ConversorJson conversor;

    @Test
    void testingConversion() {
        String json = "{\"cep\": \"12345\", \"log\": \"Logan Sergey\", \"local\": \"sp\"}";
        Cep response = conversor.convert(json);
        Assertions.assertEquals("12345", response.getCep());
        Assertions.assertEquals("Logan Sergey", response.getLog());
        Assertions.assertEquals("sp", response.getLocal());
    }
}


