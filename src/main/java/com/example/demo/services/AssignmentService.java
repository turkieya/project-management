package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.Assignment;
import com.example.demo.models.Employee;
import com.example.demo.models.Project;
import com.example.demo.repositories.AssignmentRepository;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.ProjectRepository;

@Service
public class AssignmentService {

	@Autowired 
	AssignmentRepository assignmentRepo;
	
	@Autowired 
	EmployeeRepository employeeRepo;
	
	@Autowired
	ProjectRepository projectRepo;
	
	public Assignment saveAssignment(Assignment a,long idProj, long idEmp) {
		Employee emp = employeeRepo.findById(idEmp).get();
		a.setEmployee(emp);
		Project proj=projectRepo.findById(idProj).get();
		a.setProject(proj);
		assignmentRepo.save(a);
		 return a;
	}
}
