package com.crsardar.java.spring.boot.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcService
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<JdbcPerson> getJdbcPersons()
    {
        List<JdbcPerson> jdbcPersonList = jdbcTemplate.query("SELECT * FROM JDBC_PERSON", new BeanPropertyRowMapper<>(JdbcPerson.class));

        return jdbcPersonList;
    }

    public List<JdbcPerson> getJdbcPersonsFromCustomedRowMapper()
    {
        List<JdbcPerson> jdbcPersonList = jdbcTemplate.query("SELECT * FROM JDBC_PERSON", new CustomRowMapper());

        return jdbcPersonList;
    }
}
