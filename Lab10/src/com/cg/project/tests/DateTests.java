package com.cg.project.tests;

import static org.junit.Assert.*;
import com.cg.project.Date;

import org.junit.Assert;
import org.junit.Test;

public class DateTests {

	@Test
	public void testforDateData() {
	Assert.assertEquals("Date is 12/1/2019",new Date(12,1,2019).toString());
	}
}
