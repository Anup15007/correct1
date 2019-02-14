package com.cg.project;

public class Person 
{
	private String firstName;
	private String lastName;
	private char gender;
	
	Person()
	{
		firstName = "";
		lastName = "";
		gender = '\0';
	}
	
	public Person(String firstName, String lastName,char gender)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public void setFirstName(String fn)
	{
		firstName = fn;
	}
	
	public void setLastName(String ln)
	{
		lastName = ln;
	}
	
	public void setGender(char g)
	{
		gender = g;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public char getGender()
	{
		return gender;
	}

	public String displayDetails() {
		return "Firstname="+firstName+" LastName="+lastName+" Gender="+gender;
	}
	
	
}
