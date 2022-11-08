package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Project;
import com.example.demo.services.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired 
	ProjectService projService;
	
	@PostMapping(path="/add")
	public Project addProject(@RequestBody Project proj) {
		return projService.saveProject(proj);
	}
}
