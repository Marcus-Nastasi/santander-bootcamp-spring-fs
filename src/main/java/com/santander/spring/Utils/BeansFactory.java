package com.santander.spring.Utils;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeansFactory {

    @Bean
    public Gson gson() {
        return new Gson();
    }

    @Bean
    public Map<String, String> pb() {
        return new HashMap<>();
    }
}


