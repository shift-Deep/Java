package com.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.entity.Employee;
import com.demo2.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	//post insert, get get, put update ; delete-> remove
	@PostMapping("/addEmployee") //http://localhost:4523/employee/addEmployee
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@PutMapping("/updateEmployee") //http://localhost:4523/employee/updateEmployee
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	@GetMapping("/getEmployee/{eid}")  //http://localhost:4523/employee/getEmployee/eid
	public Employee getEmployee(@PathVariable("eid") int empId) {
		return service.getEmployee(empId);
	}
	
	@GetMapping("/getAllEmployees") //http://localhost:4523/employee/getAllEmployee
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
		
	}
	@DeleteMapping("/deleteEmployee/{eid}")
	public String deleteEmployee(@PathVariable("eid") int empid) {
		return service.deleteEmployee(empid);
	}
	

}
