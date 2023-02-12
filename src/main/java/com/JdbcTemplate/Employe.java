package com.JdbcTemplate;

public class Employe {

	
	private String id;
	
	private String name;
	
	private String department;
	
	
	private String email;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Employe(String id, String name, String department, String city) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.email = city;
	}


	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", department=" + department + ", email=" + email + "]";
	}
	
	
	
	
	
}
