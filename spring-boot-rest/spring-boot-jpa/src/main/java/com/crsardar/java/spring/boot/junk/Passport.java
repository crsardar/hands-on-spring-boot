package com.crsardar.java.spring.boot.junk;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport
{
    @Id
    @GeneratedValue
    private Long id;

    private String number;

    protected Passport()
    {
    }

    public Passport(String number)
    {
        this.number = number;
    }

    public Long getId()
    {
        return id;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "Passport{" + "id=" + id + ", number='" + number + '\'' + '}';
    }
}
