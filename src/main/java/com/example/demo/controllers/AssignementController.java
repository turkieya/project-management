package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Assignment;
import com.example.demo.services.AssignmentService;

@RestController
@RequestMapping("/assignment")
public class AssignementController {
	
	@Autowired 
	AssignmentService assignService;
	
	@PostMapping(path="/add/{idProj}/{idEmp}")
	public Assignment addAssignment(@RequestBody Assignment a,@PathVariable long idProj,@PathVariable long idEmp) {
		return assignService.saveAssignment(a,idProj,idEmp);
	}

}
