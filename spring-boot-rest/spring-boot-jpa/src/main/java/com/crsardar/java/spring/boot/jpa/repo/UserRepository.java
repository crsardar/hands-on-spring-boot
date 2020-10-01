package com.crsardar.java.spring.boot.jpa.repo;

import com.crsardar.java.spring.boot.jpa.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
