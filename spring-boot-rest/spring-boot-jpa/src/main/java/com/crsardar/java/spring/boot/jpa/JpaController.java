package com.crsardar.java.spring.boot.jpa;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.crsardar.java.spring.boot.jpa.dao.Email;
import com.crsardar.java.spring.boot.jpa.dao.EmailRepo;
import com.crsardar.java.spring.boot.jpa.dao.PhoneNumber;
import com.crsardar.java.spring.boot.jpa.dao.PhoneRepo;
import com.crsardar.java.spring.boot.jpa.dao.User;
import com.crsardar.java.spring.boot.jpa.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailRepo emailRepo;

    @Autowired
    private PhoneRepo phoneRepo;

    @GetMapping("/users")
    public List<User> createUser()
    {
        User user = new User();
        user.setFirstName("Ganesha");
        user.setLastName("Lord");
        user.setDob(new Date());
        user.setPassword("Password is not set yet.");

        Email email = new Email("siddhidata@ganesha.com", Email.EmailTypes.HOME);
        email.setUser(user);
        user.setEmails(Arrays.asList(email));

        PhoneNumber phoneNumber = new PhoneNumber("+11-111", PhoneNumber.PhoneTypes.HOME);
        phoneNumber.setUser(user);
        user.setPhoneNumbers(Arrays.asList(phoneNumber));

        User savedUser = userRepository.save(user);

        System.out.println("\n\n\nSaved User's ID = " + savedUser + "\n\n\n");

        emailRepo.save(email);
        phoneRepo.save(phoneNumber);

        List<User> userList = userRepository.findAll();

        System.out.println("\n\n\nAll Saved Users= " + userList + "\n\n\n");

        return userList;
    }
}
