package com.crsardar.java.spring.boot.junk;

import com.crsardar.java.spring.boot.JpaApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class) // Launch a SpringBoot Context. Old "@RunWith(SpringRunner.class)"
@SpringBootTest(classes = JpaApplication.class) // - This make sures lunched SpringBoot Context is a Test Context
public class CourseRepositoryTest
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void testFindByIdBasic()
    {
        logger.info("The test is running...");
        Course course = courseRepository.findById(11003L);
        Assertions.assertNotNull(course, "Course with Id = 11003 in not found.");
        Assertions.assertEquals("Spring Courses.", course.getName());
    }

}
