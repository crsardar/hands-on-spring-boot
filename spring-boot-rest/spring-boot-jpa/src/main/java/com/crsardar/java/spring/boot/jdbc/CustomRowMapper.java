package com.crsardar.java.spring.boot.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomRowMapper implements RowMapper<JdbcPerson>
{

    @Override
    public JdbcPerson mapRow(ResultSet resultSet, int i) throws SQLException
    {
        JdbcPerson jdbcPerson = new JdbcPerson();
        jdbcPerson.setId(resultSet.getInt("id"));
        jdbcPerson.setName(resultSet.getString("name"));
        jdbcPerson.setDob(resultSet.getTimestamp("dob"));

        return jdbcPerson;
    }
}
