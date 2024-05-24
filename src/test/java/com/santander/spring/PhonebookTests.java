package com.santander.spring;

import com.santander.spring.Domain.Phonebook;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PhonebookTests {

    @Autowired
    private Phonebook phonebook;

    @Test
    void testAddingPhone() {
        phonebook.addPhone("James Wolves", "11998765533");
        phonebook.addPhone("Megan Louren", "66448383830");
        assertEquals("11998765533", phonebook.getPhonebook().get("James Wolves"));
        assertEquals("66448383830", phonebook.getPhonebook().get("Megan Louren"));
    }
}


