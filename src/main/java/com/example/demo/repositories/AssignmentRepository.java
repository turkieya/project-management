package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository< Assignment,Long>{
	
//	@Modifying
	//@Query("update Assignment a set a.date=:date,a.nom=:nom,a.resultat=:resultat where a.id=:id")
//	void edit(@Param("id") Long id,@Param("date") String date,@Param("nom") String nom,@Param("resultat") String resultat);

}
