package com.JdbcTemplate;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.JdbcTemplate.dao.EmployeDao;
import com.JdbcTemplate.dao.EmployeDaoImpl;

@Configuration
public class BeanConfigCls {
	
	
	
	@Bean("ds")
	public DataSource getDataSource() {
		
		DriverManagerDataSource a= new  DriverManagerDataSource();
		
		a.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		a.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		a.setUsername("dms_test");
		a.setPassword("dms_test");
		
		
		return a;
	}
	
	
	@Bean("jdbcAnnoTemplate")
	public JdbcTemplate getTemplate() {
		
		return new JdbcTemplate(getDataSource()); 
	}
	
	@Bean("servicePookanna")
	public EmployeDao getDAO() {
		
		EmployeDaoImpl e=new EmployeDaoImpl();
		
	e.setJdbcTemp(getTemplate());
	
	return e;
	}
	
	

}
