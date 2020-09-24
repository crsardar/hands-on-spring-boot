package com.crsardar.java.spring.boot.jpa;

import java.util.List;

import com.crsardar.java.spring.boot.jpa.dao.EntityManagerRepo;
import com.crsardar.java.spring.boot.jpa.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa/entity-manager")
public class JpaEntityManagerController
{
    @Autowired
    private EntityManagerRepo entityManagerRepo;

    /**
     * First need to hit http://127.0.0.1:8080/jpa/users to create at least one user,
     * then hit http://127.0.0.1:8080/jpa/entity-manager/users/1
     */
    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable Long id)
    {
        return entityManagerRepo.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return entityManagerRepo.getAllUsers();
    }
}
