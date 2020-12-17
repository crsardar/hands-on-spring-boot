package com.crsardar.java.spring.boot.rest.internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class InternationalizedController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello-world")
    public ResponseEntity<InternationalizedMsg> sayHelloWorld(){

        Locale locale = LocaleContextHolder.getLocale();

        String message = messageSource.getMessage("hello.world", null, locale);

        System.out.println("------> sayHelloWorld : Message = " + message);

        InternationalizedMsg internationalizedMsg = new InternationalizedMsg();
        internationalizedMsg.setMessage(message);
        internationalizedMsg.setLocale(locale);

        return ResponseEntity.ok(internationalizedMsg);
    }
}
