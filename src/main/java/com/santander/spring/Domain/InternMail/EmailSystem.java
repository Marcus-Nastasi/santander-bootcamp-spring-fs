package com.santander.spring.Domain.InternMail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailSystem {

    @Autowired
    private Sender senderNoReply;

    @Autowired
    private Sender techEmail;

    public void sendConfirmation() {
        System.out.println(senderNoReply);
        System.out.println("Your register has been approved.");
    }

    public void sendWelcome() {
        techEmail.setName("Tech Team");
        techEmail.setEmail("tech@dio.com");
        System.out.println(techEmail);
        System.out.println("Welcome to the tech team!");
    }
}



