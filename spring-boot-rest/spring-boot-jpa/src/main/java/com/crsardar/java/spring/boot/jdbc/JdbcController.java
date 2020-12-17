package com.crsardar.java.spring.boot.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jdbc")
public class JdbcController
{
    @Autowired
    private JdbcService jdbcService;

    @GetMapping("/users")
    public List<JdbcPerson> getJdbcPersons()
    {
        return jdbcService.getJdbcPersons();
    }

    @GetMapping("/users/costumed-row-mapper")
    public List<JdbcPerson> getJdbcPersonsCustomedRowMapper()
    {
        return jdbcService.getJdbcPersonsFromCustomedRowMapper();
    }
}
