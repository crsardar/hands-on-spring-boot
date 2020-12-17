package com.crsardar.handson.spring.random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RandomApp
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = SpringApplication.run(RandomApp.class, args);
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        binarySearch.search(new int[]{1, 2, 3, 4, 5}, 5);
    }
}
