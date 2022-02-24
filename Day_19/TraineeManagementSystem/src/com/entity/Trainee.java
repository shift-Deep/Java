package com.entity;

public class Trainee {

	private String Tname;
	private String Department;
	private String add;
	private String email;
	
	
	
	
	
	public Trainee(String tname, String department, String add, String email) {
		super();
		Tname = tname;
		Department = department;
		this.add = add;
		this.email = email;
	}





	@Override
	public String toString() {
		return "Name=" + Tname + ", Department=" + Department + ", Address=" + add + ", Email=" + email;
	}
	
	
	
}
