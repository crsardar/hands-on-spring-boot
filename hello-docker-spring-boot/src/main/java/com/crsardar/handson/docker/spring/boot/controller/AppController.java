/**
 * @author Chittaranjan Sardar
 */

package com.crsardar.handson.docker.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController
{
    private int count = 0;

    @GetMapping("/")
    public String helloSpringBootInDocker(){

        count++;
        return "Hello World, SpringBoot in Docker Container! Count = " + count;
    }
}
