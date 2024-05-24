package com.santander.spring;

import com.santander.spring.Domain.Phonebook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    void testingRemovePhoneByName() {
        phonebook.addPhone("James Wolves", "11998765533");
        phonebook.addPhone("Megan Louren", "66448383830");
        assertEquals(2, phonebook.getPhonebook().size());
        phonebook.removePhone("Megan Louren");
        assertEquals(1, phonebook.getPhonebook().size());
        assertEquals("11998765533", phonebook.getPhonebook().get("James Wolves"));
    }

    @Test
    void testingFindByName() {
        phonebook.addPhone("James Wolves", "11998765533");
        phonebook.addPhone("Megan Louren", "66448383830");
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("James Wolves", "11998765533");
        assertEquals(stringMap, phonebook.findByName("James Wolves"));
        stringMap.remove("James Wolves");
        stringMap.put("Megan Louren", "66448383830");
        assertEquals(stringMap, phonebook.findByName("Megan Louren"));
    }
}


