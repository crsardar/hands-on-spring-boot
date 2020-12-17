package com.crsardar.java.spring.boot.junk;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Student
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "student", fetch = FetchType.LAZY)
    private Passport passport;

    @ManyToMany
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses  = new ArrayList<>();

    protected Student()
    {
    }

    public Student(String name, Passport passport)
    {
        this.name = name;
        this.passport = passport;
    }

    public Long getId()
    {
        return id;
    }

    public Student(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Passport getPassport()
    {
        return passport;
    }

    public void setPassport(Passport passport)
    {
        this.passport = passport;
    }

    public List<Course> getCourses()
    {
        return courses;
    }

    public void addCourse(Course course)
    {
        this.courses.add(course);
    }

    public boolean removeCourse(Course course)
    {
        return courses.remove(course);
    }

    @Override
    public String toString()
    {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + "}";
    }
}
