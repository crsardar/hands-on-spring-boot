package com.crsardar.java.spring.boot.junk;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@NamedQueries(value = { @NamedQuery(name = "select_all_courses", query = "SELECT c FROM Course c"),
@NamedQuery(name = "select_spring_courses", query = "SELECT c FROM Course c WHERE name LIKE 'Spring%'")})
public class Course
{
    @Id
    @GeneratedValue

    private Long id;
    private String name;

    @CreationTimestamp
    private LocalDate creationTime;

    @UpdateTimestamp
    private LocalDate lastUpdateTime;

    protected Course()
    {
    }

    public Course(String name)
    {
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getCreationTime()
    {
        return creationTime;
    }

    public void setCreationTime(LocalDate creationTime)
    {
        this.creationTime = creationTime;
    }

    public LocalDate getLastUpdateTime()
    {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDate lastUpdateTime)
    {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString()
    {
        return "Course{" + "name='" + name + '\'' + ", creationTime=" + creationTime + ", lastUpdateTime=" + lastUpdateTime + '}';
    }
}
