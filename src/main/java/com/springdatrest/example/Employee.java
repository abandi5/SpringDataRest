package com.springdatrest.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@RestResource
@Table(name="EMPLOYEE")
public class Employee
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;
    
    
    @Column(name="FIRSTNAME")
    @NotEmpty(message = "firstName is mandatory.")
	@Size(min = 2, max = 20)
    private String firstname;
    
    @Column(name="LASTNAME")
    @NotEmpty(message = "firstName is mandatory.")
	@Size(min = 2, max = 20)
    private String lastname;

	public Employee()
	{
		super();
	}

	public Employee(Integer id, String firstname, String lastname)
	{
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	
}