package com.crsardar.java.spring.boot.rest.springbootrest;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SuperExceptionHandler
{
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) throws Exception
    {
        System.out.println("SuperExceptionHandler#handleException in action.");

        // This will over-ride @ResponseStatus
        // If it is already handled by @ResponseStatus, then let that work.
        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
        {
            throw e;
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Some problem in Server, unable to process your request.\nDetails - " + e.getMessage());
    }
}
