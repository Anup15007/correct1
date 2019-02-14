package com.cg.eis.lab_5_1.bean;

public class Employee 
{
	int id;
	String name;
	double salary;
	Designations designation;
	InsuranceSchemes insuranceSchemes;
	
	public Employee(int id, String name,double salary, Designations designation,
			InsuranceSchemes insuranceSchemes) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceSchemes = insuranceSchemes;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Designations getDesignation() {
		return designation;
	}


	public void setDesignation(Designations designation) {
		this.designation = designation;
	}


	public InsuranceSchemes getInsuranceSchemes() {
		return insuranceSchemes;
	}


	public void setInsuranceSchemes(InsuranceSchemes insuranceSchemes) {
		this.insuranceSchemes = insuranceSchemes;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", designation=" + designation + ", insuranceSchemes="
				+ insuranceSchemes + "]";
	}
}
