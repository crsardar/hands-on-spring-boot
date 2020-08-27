package com.crsardar.java.spring.boot.rest.springbootrest.user;

import com.crsardar.java.spring.boot.rest.springbootrest.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDAO userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Integer id){

        return userService.getUser(id);
    }
}
