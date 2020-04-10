/**
 * @author Chittaranjan Sardar
 */

package com.crsardar.handson.docker.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController
{
    @GetMapping("/")
    public String helloSpringBootInDocker(){

        return "Hi there, I am the SpringBoot running inside a Docker Container!";
    }
}
