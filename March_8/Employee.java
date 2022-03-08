package com.jpademo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
	@Id
	private int empid;
	private String empName;
	private int empsal;
	private String empadd;
	
	public Employee() {
		
	}
	
	public Employee(int empid, String empName, int empsal, String empadd) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empsal = empsal;
		this.empadd = empadd;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empsal=" + empsal + ", empadd=" + empadd + "]";
	}
	
	
	
	
	
}
