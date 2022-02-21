package day_16;

public class Employee {
	
	private
	String Name;
	int salary;
	String Address;
	int Age;
	String Department;
	String designation;
	
	
	public Employee(String name, int salary, String address, int age, String department, String designation) {
		super();
		Name = name;
		this.salary = salary;
		Address = address;
		Age = age;
		Department = department;
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", salary=" + salary + ", Address=" + Address + ", Age=" + Age
				+ ", Department=" + Department + ", designation=" + designation + "]";
	}
	
	
	
	
	
	

}
