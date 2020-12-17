package com.crsardar.java.spring.boot.rest.internationalization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class InternationalizedApp {

    public static void main(String[] args) {

        SpringApplication.run(InternationalizedApp.class, args);
    }

    // NOTES -
    // In Spring 5+ we do NOT need to configure -
    // LocaleResolver
    // ResourceBundleMessageSource
    /*
    @Bean
    public LocaleResolver localeResolver() {

        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.US);
        // Also tried with this
//        sessionLocaleResolver.setDefaultLocale(new Locale("en-US"));
        return sessionLocaleResolver;
    }

    @Bean
    public ResourceBundleMessageSource resourceBundleMessageSource() {
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("messages");

        return resourceBundleMessageSource;
    }
    */
}
