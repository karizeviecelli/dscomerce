package com.karizeviecelli.aula1.entities;

import org.springframework.beans.factory.annotation.Autowired;

import com.karizeviecelli.aula1.services.TaxService;

public class Employee {
	
	@Autowired
	private String name;
	
	@Autowired
	private double grossSalary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	

	
	

}
