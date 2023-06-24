package com.employee.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empdid;
	private String ename;
	private String email;
	private String loc;
	
	
	
	public Employee() {
		super();
	}



	public Employee(int empdid, String ename, String email, String loc) {
		super();
		this.empdid = empdid;
		this.ename = ename;
		this.email = email;
		this.loc = loc;
	}



	public int getEmpdid() {
		return empdid;
	}



	public void setEmpdid(int empdid) {
		this.empdid = empdid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getLoc() {
		return loc;
	}



	public void setLoc(String loc) {
		this.loc = loc;
	}



	
	
	
	
	
	
}
