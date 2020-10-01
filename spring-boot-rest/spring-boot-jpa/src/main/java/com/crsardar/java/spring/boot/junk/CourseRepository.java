package com.crsardar.java.spring.boot.junk;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository
{
    @Autowired
    private EntityManager em;

    public Course findById(final Long id)
    {
        return em.find(Course.class, id);
    }

}
