package com.crsardar.java.spring.boot.rest.internationalization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternationalizedApp {

    public static void main(String[] args) {

        SpringApplication.run(InternationalizedApp.class, args);
    }

    // NOTES -
    // In Spring 5+ we do NOT need to configure -
    // LocaleResolver
    // ResourceBundleMessageSource
}
