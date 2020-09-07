package com.crsardar.java.spring.boot.jpa.dao;

import javax.persistence.*;

@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue
    private Long id;

    private String number;

    private PhoneTypes phoneTypes;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public PhoneNumber() {
    }

    public PhoneNumber(String number, PhoneTypes phoneTypes) {
        this.number = number;
        this.phoneTypes = phoneTypes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneTypes getPhoneTypes() {
        return phoneTypes;
    }

    public void setPhoneTypes(PhoneTypes phoneTypes) {
        this.phoneTypes = phoneTypes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", phoneTypes=" + phoneTypes +
                ", user=" + user +
                '}';
    }

    public static enum PhoneTypes{
        MOBILE,
        HOME,
        WORK,
        MAIN,
        WORK_FAX,
        HOME_FAX,
        PAGER,
        OTHER
    }
}
