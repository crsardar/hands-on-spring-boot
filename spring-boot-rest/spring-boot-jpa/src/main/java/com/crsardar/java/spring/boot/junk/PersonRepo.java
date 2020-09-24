package com.crsardar.java.spring.boot.junk;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PersonRepo
{
    @Autowired
    private EntityManager entityManager;

    public void createPerson(final Person person)
    {
        entityManager.persist(person);
    }

    public List<Person> getPersons()
    {
        TypedQuery<Person> allPersons = entityManager.createNamedQuery("get_all_persons", Person.class);
        return allPersons.getResultList();
    }
}
