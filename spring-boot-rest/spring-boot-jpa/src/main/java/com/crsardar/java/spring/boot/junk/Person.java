package com.crsardar.java.spring.boot.junk;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "get_all_persons", query = "SELECT p FROM Person p")
public class Person
{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;

    public Person()
    {
    }

    public Person(String name, String city)
    {
        this.name = name;
        this.city = city;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", city='" + city + '\'' + '}';
    }
}
