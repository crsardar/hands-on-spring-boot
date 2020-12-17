package com.crsardar.java.spring.boot.junk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/junk/")
public class PersonController
{
    int count = 0;

    @Autowired
    private PersonRepo personRepo;

    @GetMapping("/persons")
    public List<Person> getPersons()
    {
        count++;

        Person person = new Person("Person " + count, "City " + count);
        personRepo.createPerson(person);

       return personRepo.getPersons();
    }
}
