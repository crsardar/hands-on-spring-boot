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

        return "Hello World, SpringBoot indide a Docker Container!";
    }
}
