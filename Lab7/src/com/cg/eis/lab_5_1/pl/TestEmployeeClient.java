
package com.cg.eis.lab_5_1.pl;
import java.util.Scanner;

import com.cg.eis.lab_5_1.bean.*;
import com.cg.eis.lab_5_1.service.EmployeeInsuranceSystemService;

public class TestEmployeeClient {

	public static void main(String[] args) {
		EmployeeInsuranceSystemService eis = new EmployeeInsuranceSystemService();
		Scanner sc  = new Scanner(System.in);
		boolean mainLoop = true;
		while(mainLoop) {
			System.out.println("\tEnter Menu\n1.Add Details\n2.Print Emp Details\n3.Print EmpDaet by Insurance Scheme");
			System.out.println("Enter choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
					addEmployeeDetails(eis,sc);break;
			case 2:
					printEmployeeDetails(eis,sc);break;
			case 3:
					printEmployeeInsuranceSchemes(eis,sc);break;
			default:
					System.out.println("Invalid Choice!!");break;
			}
		}
	}
	private static void addEmployeeDetails(EmployeeInsuranceSystemService eis,Scanner sc) {
		System.out.println("Enter Employee Id:");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Employee Salary:");
		double salary=sc.nextDouble();
		Designations d = null;
		boolean eDes = true;
		while(eDes) {
			System.out.println("Enter Employee Designation:\n1.System Associate\n2.Programmer\n3.Manager\n4.Clerk");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:	d =Designations.SystemAssociate;break;
			case 2:	d = Designations.Programmer;break;
			case 3: d = Designations.Manager;break;
			case 4:	d = Designations.Clerk;break;
			default: System.out.println("Invalid Choice");break;
			}
			eDes = false;
		}
		InsuranceSchemes e = eis.showInsuranceSchemes(salary,d);
		eis.addEmployeeDetails(id, name, salary, d, e);
		System.out.println("Saved Employee Info");
	}
	private static void printEmployeeDetails(EmployeeInsuranceSystemService eis,Scanner sc) {
		System.out.println("Enter Employeee Id:");
		String eDetails = eis.dispEmployeeDetails(sc.nextInt());
		if(eDetails!=null)
			System.out.println(eDetails);
		else
			System.out.println("Invalid Employee Id");
	}
	private static void printEmployeeInsuranceSchemes(EmployeeInsuranceSystemService eis,Scanner sc) {
		InsuranceSchemes eiSchemes;
		System.out.println("Enter Employee Id:");
		eiSchemes = eis.locateEmplInsuranceScheme(sc.nextInt());
		if(eiSchemes!=null)
			System.out.println(eiSchemes);
		else
			System.out.println("Invalid Id");
	}

}
