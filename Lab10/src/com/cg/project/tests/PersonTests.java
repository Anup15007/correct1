package com.cg.project.tests;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.cg.project.Person;

public class PersonTests {

	@Test
	public void testForFirstName() {
		Assert.assertEquals("Tirtharaj", new Person("Tirtharaj","Sur",'M').getFirstName());
	}
	
	@Test
	public void testForLastName() {
		Assert.assertEquals("Sur", new Person("Tirtharaj","Sur",'M').getLastName());
	}
	
	@Test
	public void testForGender() {
		Assert.assertEquals('M', new Person("Tirtharaj","Sur",'M').getGender());
	}
	
	@Test
	public void testForDisplayDetails() {
		Assert.assertEquals("Firstname=Tirtharaj LastName=Sur Gender=M", new Person("Tirtharaj","Sur",'M').displayDetails());
	}


}
