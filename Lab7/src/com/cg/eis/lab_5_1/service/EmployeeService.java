package com.cg.eis.lab_5_1.service;

import java.util.List;

import com.cg.eis.lab_5_1.bean.*;

public interface EmployeeService 
{
	public abstract void addEmployeeDetails(int id,String name,double salary,Designations  designation, InsuranceSchemes insuranceScheme);
	
	public abstract InsuranceSchemes showInsuranceSchemes(double salary,Designations  designation);
	
	public abstract String dispEmployeeDetails(int id);
	
	public abstract InsuranceSchemes locateEmplInsuranceScheme(int id);
	
	public abstract List<Employee> findAll(InsuranceSchemes insuranceScheme);
	
	public abstract List<Employee> findAllsortedBySalary();
	
}
