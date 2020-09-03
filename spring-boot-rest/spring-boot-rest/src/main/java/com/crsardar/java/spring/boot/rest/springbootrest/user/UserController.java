package com.crsardar.java.spring.boot.rest.springbootrest.user;

import com.crsardar.java.spring.boot.rest.springbootrest.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAO userService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Integer id) {

        User user = userService.getUser(id);
        if(user == null)
            throw new UserNotFoundException("Invalid user id = " + id);

        return user;
    }

    @GetMapping("/users")
    public List<User> getAllUser() {

        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {

        if (user == null) {
            throw new GenericUserException("This operation is not allowed.");
        }
        if(user.getFirstName() == null || "".equals(user.getFirstName().trim()))
            throw new GenericUserException("User's First Name can not be empty.");

        User newUser = userService.addUser(user);

        URI uri = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newUser.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) throws Exception
    {
        if(id == null || id <= 0)
        {
            throw new RuntimeException("Are you mad? Given user id = " + id + ".");
        }

        ResponseEntity<String> responseEntity = null;

        User user = userService.deleteUser(id);
        if(user != null)
        {
            responseEntity = ResponseEntity.status(HttpStatus.OK).body("User with id = " + id + " is deleted successfully.");
        }
        else
        {
            throw new UserNotFoundException("User with id = " + id + " does not exist.");
        }
        return responseEntity;
    }

    @ExceptionHandler(GenericUserException.class) // NOTE - It has Highest Priority. It will over-ride @ControllerAdvice & @ResponseStatus
    public ResponseEntity<UserErrorMessage> handleErrors(Exception ex) throws Exception
    {
        System.out.println("UserController#handleErrors in action.");

        // This will over-ride @ResponseStatus
        // If it is already handled by @ResponseStatus, then let that work.
//        if(AnnotationUtils.findAnnotation(ex.getClass(), ResponseStatus.class) != null)
//        {
//            throw ex;
//        }

        UserErrorMessage userErrorMessage = new UserErrorMessage(new Date(), ex.getMessage());

        ResponseEntity<UserErrorMessage> responseEntity = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(userErrorMessage);
        return responseEntity;
    }
}
