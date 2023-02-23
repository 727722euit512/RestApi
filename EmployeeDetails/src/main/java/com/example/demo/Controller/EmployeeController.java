package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.descriptor.web.ContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.Service.Employeeservice;

@RestController
public class EmployeeController {
	@Autowired
	Employeeservice service;
	
	@PostMapping("/Empolyee")
	public boolean addEmpolyee(@RequestBody Employee Empolyee) {
		return service.addEmployee(Empolyee);     
	}
	@GetMapping("/Empolyee")
	public List<Employee> read(){
		return service.getEmployee();                            
	}
	@GetMapping("/Empolyee{id}")
	public Optional<Employee> readById(@PathVariable int id){
		return service.getEmployeeById(id);
	}

}