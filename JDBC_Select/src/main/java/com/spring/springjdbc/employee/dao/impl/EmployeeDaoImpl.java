package com.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.employee.dao.EmployeeDao;
import com.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int update = jdbcTemplate.update(sql, employee.getId(),employee.getFirstName(),employee.getLastName());
		return update;
	}


	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id = ?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return employee;
	}

}
