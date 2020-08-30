package com.crsardar.java.spring.boot.rest.springbootrest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SuperExceptionHandler
{
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e)
    {
        System.out.println("SuperExceptionHandler#handleException in action.");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Some problem in Server, unable to process your request.\nDetails - " + e.getMessage());
    }
}
