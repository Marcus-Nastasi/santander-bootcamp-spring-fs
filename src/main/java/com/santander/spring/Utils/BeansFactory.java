package com.santander.spring.Utils;

import com.google.gson.Gson;
import com.santander.spring.Domain.InternMail.Sender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeansFactory {

    @Bean
    @Scope("prototype")
    public Sender sender() {
        System.out.println("CREATING SENDER INSTANCE");
        Sender sender = new Sender();
        sender.setName("Santander DIO");
        sender.setEmail("noreply@dio.com");
        return sender;
    }

    @Bean
    public Gson gson() {
        return new Gson();
    }

    @Bean
    public Map<String, String> pb() {
        return new HashMap<>();
    }
}



