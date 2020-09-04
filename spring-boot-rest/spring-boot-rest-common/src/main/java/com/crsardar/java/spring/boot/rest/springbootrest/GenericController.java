package com.crsardar.java.spring.boot.rest.springbootrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenericController {

    @GetMapping("/")
    public String hello()
    {
        return "Hi there, I am still breathing!";
    }
}
