package com.crsardar.java.spring.boot.junk;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepository
{
    @Autowired
    private EntityManager em;

    public Course findById(final Long id)
    {
        return em.find(Course.class, id);
    }

    public void deleteById(final Long id)
    {
        Course course = findById(id);
        em.remove(course);
    }

    public Course save(final Course course)
    {
        if (course.getId() == null)
        {
            em.persist(course);
        }
        else
        {
            em.merge(course);
        }

        return course;
    }
}
