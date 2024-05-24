package com.santander.spring;

import com.santander.spring.Domain.ViaCep.Cep;
import com.santander.spring.Domain.ViaCep.ConversorJson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ConversorJsonTests {

    @Autowired
    private ConversorJson conversor;

    @Test
    void testingConversion() {
        String json = "{\"cep\": \"12345\", \"log\": \"Logan Sergey\", \"local\": \"sp\"}";
        Cep response = conversor.convert(json);
        assertEquals("12345", response.getCep());
        assertEquals("Logan Sergey", response.getLog());
        assertEquals("sp", response.getLocal());
    }
}


