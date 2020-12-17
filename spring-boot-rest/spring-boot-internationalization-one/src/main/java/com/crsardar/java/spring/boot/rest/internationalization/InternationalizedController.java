package com.crsardar.java.spring.boot.rest.internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class InternationalizedController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello-world")
    public ResponseEntity<InternationalizedMsg> sayHelloWorld(
            // "required = false" - is not working as expected.
            // Giving - Failed to convert value of type 'java.lang.String' to required type 'java.util.Locale';
            // nested exception is java.lang.IllegalArgumentException: Locale part "en-US,en;q=0.9"
            // contains invalid characters
            // TODO - Solve this problem
            @RequestHeader(name = "Accept-Language", required = false) Locale locale){

        System.out.println("------> Locale = " + locale + " : " + locale.getClass());

        String message = messageSource.getMessage("hello.world", null, locale);

        System.out.println("------> Message = " + message);

        InternationalizedMsg internationalizedMsg = new InternationalizedMsg();
        internationalizedMsg.setMessage(message);
        internationalizedMsg.setLocale(locale);

        return ResponseEntity.ok(internationalizedMsg);
    }
}
