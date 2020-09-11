package com.crsardar.java.spring.boot.jdbc;

import java.util.Date;
public class JdbcPerson
{
    private Integer id;
    private String name;
    private Date dob;

    public JdbcPerson()
    {
    }

    public JdbcPerson(Integer id, String name, Date dob)
    {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
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

    public Date getDob()
    {
        return dob;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    @Override
    public String toString()
    {
        return "JdbcPerson{" + "id=" + id + ", name='" + name + '\'' + ", dob=" + dob + '}';
    }
}
