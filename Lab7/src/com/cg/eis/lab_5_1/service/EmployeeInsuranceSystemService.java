package com.cg.eis.lab_5_1.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.cg.eis.comparator.EmployeeComparatorBySalary;
import com.cg.eis.lab_5_1.bean.Designations;
import com.cg.eis.lab_5_1.bean.Employee;
import com.cg.eis.lab_5_1.bean.InsuranceSchemes;

public class EmployeeInsuranceSystemService implements EmployeeService {
	
	public HashMap<Integer,Employee> empList = new HashMap<>();
	
	
	@Override
	public void addEmployeeDetails(int id, String name, double salary, Designations designation,
			InsuranceSchemes insuranceScheme) {
		this.empList.put(id, new Employee(id, name, salary, designation, insuranceScheme));
		
	}

	@Override
	public InsuranceSchemes showInsuranceSchemes(double salary, Designations designation) {
		if(salary>=40000 && designation == Designations.Manager) {
			return InsuranceSchemes.SchemeA;
		}
		else if(salary >=20000 && salary <40000 && designation == Designations.Programmer) {
			return InsuranceSchemes.SchemeB;
		}
		else if(salary >5000 && salary <20000 && designation == Designations.SystemAssociate) {
			return InsuranceSchemes.SchemeC;
		}
		else if(salary < 5000 && designation == Designations.Clerk) {
			return InsuranceSchemes.NoSchemes;
		}
		return null;
	}

	@Override
	public String dispEmployeeDetails(int id) {
		if(this.empList.containsKey(id))
			return this.empList.get(id).toString();
		return null;
	}

	@Override
	public InsuranceSchemes locateEmplInsuranceScheme(int id) {
		if(this.empList.containsKey(id)) {
			return this.empList.get(id).getInsuranceSchemes();
		}
		return null;
	}

	@Override
	public List<Employee> findAll(InsuranceSchemes insuranceScheme) {
		List<Employee> ret = new ArrayList<Employee>();
		for(int eid : this.empList.keySet()) {
			ret.add(this.empList.get(eid));
		}
		
		return ret;
	}

	@Override
	public List<Employee> findAllsortedBySalary() {
		List<Employee> ret = new ArrayList<>(this.empList.values());
		Collections.sort(ret,new EmployeeComparatorBySalary());
		return null;
	}
	
}
