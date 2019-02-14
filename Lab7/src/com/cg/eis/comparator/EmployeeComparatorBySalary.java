package com.cg.eis.comparator;

import java.util.Comparator;

import com.cg.eis.lab_5_1.bean.Employee;

public class EmployeeComparatorBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int)(o1.getSalary()-o2.getSalary());
	}
	
	

}
