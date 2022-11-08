package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Project;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired 
	ProjectRepository ProjectRepo;
	
	public Project saveProject(Project proj) {
		ProjectRepo.save(proj);
		 return proj;
	}
}
