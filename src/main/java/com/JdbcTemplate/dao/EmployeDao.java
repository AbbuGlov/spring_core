package com.JdbcTemplate.dao;

import com.JdbcTemplate.Employe;

public interface EmployeDao {

	
	public int insert(Employe e);
	
	public int delete(int id);
	
	public int update(Employe e);
	
	public Employe getEmploye(String id);
}
