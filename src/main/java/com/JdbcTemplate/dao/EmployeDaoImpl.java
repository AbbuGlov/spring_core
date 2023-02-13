package com.JdbcTemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.JdbcTemplate.Employe;

public class EmployeDaoImpl implements EmployeDao{

	
	
	public static class RowMapperr implements RowMapper<Employe>{

		@Override
		public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
				
			return new Employe(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		
	}
	
	
	
	private JdbcTemplate jdbcTemp;
	
	
	@Override
	public int insert(Employe e) {
	
		
		String query="insert into employe(id, name,department,email) values(?,?,?,?)";
    	
		int i=this.jdbcTemp.update(query,e.getId(),e.getName(),e.getDepartment(),e.getEmail());
		
		System.out.println(query);
		
		System.out.print("number of rows affected :");
		System.out.println(i);
		return i;
	}


	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}


	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}


	public EmployeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int delete(int id) {
		String sql="delete from employe where id=?";
		
		this.jdbcTemp.update(sql,id);
		return 0;
	}


	@Override
	public int update(Employe e) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Employe getEmploye(String id) {
	
		
		String sql="select * from employe where id=?";
		
		Employe e=this.jdbcTemp.queryForObject(sql,new RowMapperr(),id);
		
				System.out.println(sql);
		
		return e;
	}
	
	

	
}
