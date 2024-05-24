package com.santander.spring.Domain.ViaCep;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {

    @Autowired
    private Gson gson;

    public Cep convert(String json) {
        return gson.fromJson(json, Cep.class);
    }
}


