package com.crsardar.java.spring.boot.jpa.entitymanager;

import javax.persistence.EntityManager;

import com.crsardar.java.spring.boot.jpa.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EntityManagerRepo
{
    @Autowired
    private EntityManager entityManager;

    public User getUserById(final Long id)
    {
        User user = entityManager.find(User.class, id);
        return user;
    }

//    public List<User> getAllUsers()
//    {
//        TypedQuery<User> select_all_users = entityManager.createNamedQuery("select_all_users", User.class);
//        return select_all_users.getResultList();
//    }
}
