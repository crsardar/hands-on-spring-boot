package com.crsardar.java.spring.boot.jpa.repo;

import com.crsardar.java.spring.boot.jpa.dao.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepo extends JpaRepository<PhoneNumber, Long> {
}
