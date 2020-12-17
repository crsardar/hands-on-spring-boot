package com.crsardar.java.spring.boot;

import com.crsardar.java.spring.boot.junk.Course;
import com.crsardar.java.spring.boot.junk.CourseRepository;
import com.crsardar.java.spring.boot.junk.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner
{

    @Autowired
    CourseRepository courseRepository;

    public static void main(String[] args) {

        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        courseRepository.insertStudentAndCourse();
        courseRepository.insertStudentAndCourse(new Student("Kuldeep Singh"), new Course("Kubernet by Chittaranjan"));
    }
}
