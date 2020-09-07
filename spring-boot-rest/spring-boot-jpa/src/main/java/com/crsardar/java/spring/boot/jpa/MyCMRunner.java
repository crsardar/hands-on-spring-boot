package com.crsardar.java.spring.boot.jpa;

import com.crsardar.java.spring.boot.jpa.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
public class MyCMRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailRepo emailRepo;

    @Autowired
    private PhoneRepo phoneRepo;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setFirstName("Ganesha");
        user.setLastName("Lord");
        user.setDob(new Date());
        user.setPassword("Password is not set yet.");

        Email email = new Email("siddhidata@ganesha.com", Email.EmailTypes.HOME);
//        email.setUser(user);
        user.setEmails(Arrays.asList(email));
//
        PhoneNumber phoneNumber = new PhoneNumber("+11-111", PhoneNumber.PhoneTypes.HOME);
//        phoneNumber.setUser(user);
        user.setPhoneNumbers(Arrays.asList(phoneNumber));

        User savedUser = userRepository.save(user);
        savedUser = userRepository.findById(savedUser.getId()).get();

//        emailRepo.save(email);

//        phoneRepo.save(phoneNumber);

        System.out.println("\n\n\n\tSaved User's ID = " +  savedUser + "\n\n\n");
//        System.out.println("\n\n\n\tSaved Email = " +  savedUser.getEmails() + "\n\n\n");
    }
}
