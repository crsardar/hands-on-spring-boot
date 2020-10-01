package com.crsardar.java.spring.boot.junk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("junk/course/")
public class CourseController
{
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable final Long id){

        return courseRepository.findById(id);
    }
}
