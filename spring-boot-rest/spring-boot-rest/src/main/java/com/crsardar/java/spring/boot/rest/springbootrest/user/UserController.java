package com.crsardar.java.spring.boot.rest.springbootrest.user;

import com.crsardar.java.spring.boot.rest.springbootrest.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAO userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Integer id) {

        User user = userService.getUser(id);
        if(user == null)
            throw new RuntimeException("Invalid user id = " + id);

        return user;
    }

    @GetMapping("/users")
    public List<User> getAllUser() {

        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {

        if (user == null) {
            return null;
        }

        User newUser = userService.addUser(user);

        URI uri = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newUser.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }
}
