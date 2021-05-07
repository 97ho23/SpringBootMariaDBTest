package com.example.demo.rest.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Emp> listForBeanPropertyRowMapper(String deptCode) {
		String query = "select * from tb_if_empinfo where dept_code = ?";
		return jdbcTemplate.query(query,new BeanPropertyRowMapper<Emp>(Emp.class),deptCode);
	}

}
