package com.crsardar.java.spring.boot.rest.springbootrest.dao;

import com.crsardar.java.spring.boot.rest.springbootrest.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDAO {

    private static int count = 3;

    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1, "Shiva", "Lord", new Date()));
        userList.add(new User(2, "Brambha", "Lord", new Date()));
        userList.add(new User(3, "Bishnu", "Lord", new Date()));
    }

    public User getUser(final Integer id) {

        for (User user : userList) {

            if (user.getId() == id)
                return user;
        }

        return null;
    }

    public List<User> getAllUsers() {

        return userList;
    }

    public User addUser(final User user) {

        if (user != null) {

            user.setId(++count);
            userList.add(user);
        }

        return user;
    }

    public User deleteUser(final Integer id) {

        Iterator<User> iterator = userList.iterator();

        while (iterator.hasNext()) {

            User user = iterator.next();
            if (user.getId() == id) {

                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public Integer removeUser(final User user) {

        Iterator<User> iterator = userList.iterator();

        while (iterator.hasNext()) {

            User userNext = iterator.next();
            if (user.equals(userNext)) {

                return user.getId();
            }
        }
        return -1;
    }
}
