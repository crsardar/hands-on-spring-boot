package com.crsardar.handson.spring.boot.controller;

import com.crsardar.handson.spring.boot.com.crsardar.handson.spring.boot.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController
{
    /*
    For http://localhost:8080//spring-boot-rest-experiments/person.json
        http://localhost:8080//spring-boot-rest-experiments/person.xml
     */
    @RequestMapping(value = "person", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Person getPersonXML()
    {
        Person person = new Person();
        person.setId(1);
        person.setFirstName("Ohmkar");
        person.setLastName("Shiva");
        person.setVillage("Kailash");
        person.setCountry("India");

        return person;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String test()
    {
        return "/spring-boot-rest-experiments : Is Up & Running!";
    }
}
