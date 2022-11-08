package com.example.demo.controllers;

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

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired 
	EmployeeService empService;
	
	@PostMapping(path="/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empService.saveEmployee(emp);
	}
	
	@PutMapping(path="/edit/{id}")
	public void editEmployee (@RequestBody Employee emp,@PathVariable long id) {
		empService.editEmployee(emp,id);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public void deleteEmployee (@PathVariable long id) {
		empService.deleteEmployee(id);
	}

	@GetMapping(path="/get/{id}")
	public Employee getEmployee(@PathVariable long id) {
		return empService.getEmployee(id);
	}
	
	@GetMapping(path="/getAll")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}
	
	@GetMapping(path="/getByDepartement/{dep}")
	public List<Employee> getEmployeesBDepartment(@PathVariable String dep) {
		return empService.getEmployeesByDep(dep);
	}
}
