/**
 * @author Chittaranjan Sardar
 */

package com.crsardar.handson.spring.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.crsardar.handson.spring.boot"})
public class App
{
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
}
