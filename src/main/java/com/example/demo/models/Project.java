package com.example.demo.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Project implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String status;
	@JsonFormat(pattern="MM/dd/yyyy")
	private Date start_date;
	@JsonFormat(pattern="MM/dd/yyyy")
	private Date end_date;
	
	@OneToMany(mappedBy="project")
	@JsonIgnore
	private List <Assignment> assignements ;

	public Project(String name, String status, Date start_date, Date end_date, List<Assignment> assignements) {
		super();
		this.name = name;
		this.status = status;
		this.start_date = start_date;
		this.end_date = end_date;
		this.assignements = assignements;
	}

	public Project() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public List<Assignment> getAssignements() {
		return assignements;
	}

	public void setAssignements(List<Assignment> assignements) {
		this.assignements = assignements;
	}
	
}
