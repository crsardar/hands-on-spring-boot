package com.crsardar.java.spring.boot.jpa.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.org.glassfish.gmbal.Description;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import java.util.Date;
import java.util.List;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Description("First Name can not be empty.")
    private String firstName;

    private String middleName;

    @NotNull
    @Description("Last Name can not be empty.")
    private String lastName;

    @JsonIgnore
    private String password;

    @NotNull
    @Description("Date of Birth can not be empty.")
    @Past(message = "Date of Birth can not be in the future.")
    private Date dob;

    @OneToMany(mappedBy = "user")
    private List<Email> emails;

    @OneToMany(mappedBy = "user")
    private List<PhoneNumber> phoneNumbers;


    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                ", emails=" + emails +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
