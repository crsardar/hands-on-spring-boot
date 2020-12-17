package com.crsardar.java.spring.boot.junk;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepository
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

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

    public void randomExp()
    {
        TypedQuery<Course> selectAllCourses = em.createNamedQuery("select_all_courses", Course.class);
        List<Course> resultList = selectAllCourses.getResultList();
        logger.info("resultList = {}", resultList);

        TypedQuery<Course> selectSpringCourses = em.createNamedQuery("select_spring_courses", Course.class);
        resultList = selectSpringCourses.getResultList();
        logger.info("selectSpringCourses = {}", resultList);

        Query nativeQuery = em.createNativeQuery("SELECT * FROM Course", Course.class);
        List resultNativeList = nativeQuery.getResultList();
        logger.info("resultNativeList = {}", resultNativeList);
    }

    public Passport savePassport(final Passport passport)
    {
        em.persist(passport);

        return passport;
    }

    public Student saveStudent(final Student student)
    {
        if(student.getId() == null)
        {
            em.persist(student);
        }
        else
        {
            em.merge(student);
        }
        return student;
    }

    public Student findStudent(final Long id)
    {

        Student student = em.find(Student.class, 20001L);

        logger.info("Found Student = " + student);
        logger.info("Found Passport = " + student.getPassport());

        return student;
    }

    public void getStudentAndCourse()
    {
        Student student = em.find(Student.class, 20001L);

        logger.info("getStudentAndCourse : student = {}", student);
        logger.info("getStudentAndCourse : courses = {}", student.getCourses());
    }

    public void getCourseAndStudent()
    {
        Course course = em.find(Course.class, 11001L);

        logger.info("getCourseAndStudent : course = {}", course);
        logger.info("getCourseAndStudent : students = {}", course.getStudents());
    }

    public void insertStudentAndCourse()
    {
        Student student = new Student("Karamveer Singh", null);
        em.persist(student);

        Course course = new Course("Micro-Services by Chittaranjan");
        em.persist(course);

        student.addCourse(course);
        em.persist(student);
    }

    public void insertStudentAndCourse(Student student, Course course)
    {
        course.addStudent(student);
        student.addCourse(course);

        em.persist(course); // Here Order Do NOT matter
        em.persist(student); // Here Order Do NOT matter
    }
}
