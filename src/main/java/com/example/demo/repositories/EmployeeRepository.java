package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	/*@Query("select emp from Employee emp where m.departement=:departement")
	List<Employee> findEmployeeByDep(@Param("deparetement") String deparetement);*/
	@Modifying
	@Query("update Employee emp set emp.name=:name,emp.email=:email,emp.tel=:tel,emp.departement=:departement where emp.id=:id")
	void edit(@Param("id") Long id,@Param("name") String name,@Param("email") String email,@Param("tel") long tel,@Param("departement") String departement);

	@Modifying
	@Query("delete from Employee emp where emp.id=:id")
	void delete(@Param("id") long id);
	
	@Query("select emp from  Employee emp where emp.id=:id ")
	 Employee getEmployeeByid(@Param("id") Long id);
	
	@Query("select emp from Employee emp")
	List<Employee> getEmployees();
	
	@Query("select emp from Employee emp where emp.departement=:departement")
	List<Employee> getEmployeesByDep(@Param("departement") String departement);
}
