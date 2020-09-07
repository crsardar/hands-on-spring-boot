package com.crsardar.java.spring.boot.jpa.dao;

import javax.persistence.*;

@Entity
public class Email {

    @Id
    @GeneratedValue
    private Long id;

    private String emailId;

    private EmailTypes emailType;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Email() {
    }

    public Email(String emailId, EmailTypes emailType) {
        this.emailId = emailId;
        this.emailType = emailType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public EmailTypes getEmailType() {
        return emailType;
    }

    public void setEmailType(EmailTypes emailType) {
        this.emailType = emailType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static enum EmailTypes{
        HOME,
        WORK,
        OTHER
    }
}
