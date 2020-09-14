package com.crsardar.java.spring.boot.jpa.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ByEntityManager
{
    @Autowired
    private EntityManager entityManager;
}
