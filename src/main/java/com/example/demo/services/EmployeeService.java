package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired 
	EmployeeRepository EmployeeRepo;
	
	public Employee saveEmployee(Employee emp) {
		EmployeeRepo.save(emp);
		 return emp;
	}
	@Transactional
	public void editEmployee( Employee emp,long id) {
		 EmployeeRepo.edit(id,emp.getName(),emp.getEmail(),emp.getTel(),emp.getDepartement());
	}
	
	@Transactional
	public void deleteEmployee( long id) {
		 EmployeeRepo.delete(id);
	}
	
	public Employee getEmployee(long id) {
		return EmployeeRepo.getEmployeeByid(id);
	}
	
	public List<Employee> getAllEmployee() {
		return EmployeeRepo.getEmployees();
	}
	
	public List<Employee> getEmployeesByDep(String dep) {
		return EmployeeRepo.getEmployeesByDep(dep);
	}
}
