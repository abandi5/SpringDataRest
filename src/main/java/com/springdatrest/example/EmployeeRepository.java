package com.springdatrest.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
@RepositoryRestResource(collectionResourceRel = "Users", path = "user")
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
	List<Employee> findByFirstname(String firstname);
	
	List<Employee> findByIdAndLastname(Integer id, String lastname);
	
	List<Employee> findByLastname(String lastname);
	
     @Override
	@RestResource(exported=false)
    void delete(Employee entity);
}
