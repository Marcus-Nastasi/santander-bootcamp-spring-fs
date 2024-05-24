package com.santander.spring.Domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Phonebook {

    @Autowired
    private Map<String, String> phonebook;

    public Phonebook() {}

    @Override
    public String toString() {
        return("Phonebook{" + "phonebook=" + phonebook + '}');
    }

    public Map<String, String> findByName(String name) {
        Map<String, String> contactsFinded = new HashMap<>();
        for(String n: this.phonebook.keySet()) if(n.startsWith(name)) contactsFinded.put(n, this.phonebook.get(n));
        return contactsFinded;
    }

    public void addPhone(String name, String phone) {
        this.phonebook.put(name, phone);
    }

    public void removePhone(String name) {
        this.phonebook.remove(name);
    }

    public Map<String, String> getPhonebook() {
        return phonebook;
    }
}


