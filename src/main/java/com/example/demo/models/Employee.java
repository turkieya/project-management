package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private long tel;
	private String departement;
	
	@OneToMany(mappedBy="employee")
	@JsonIgnore
	private List <Assignment> assignements ;

	public Employee(String name, String email, long tel, String departement, List<Assignment> assignements) {
		super();
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.departement = departement;
		this.assignements = assignements;
	}

	public Employee() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public List<Assignment> getAssignements() {
		return assignements;
	}

	public void setAssignements(List<Assignment> assignements) {
		this.assignements = assignements;
	}

}
