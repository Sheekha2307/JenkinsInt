package JavaAssignment;

import java.util.Scanner;

import TestPackage.Day12HREncChild;

public class Day12Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day12EmployeeEnc obj = new Day12EmployeeEnc();
		//obj.setdesignation("associate"); 
		obj.setsal(1000);
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter designation of Employee");
		obj.Employee_designation = obj1.next();
		
		System.out.println("salary is "+obj.Employee_salary);
		obj.bonusCalculator();
		
		System.out.println("Now working with child class object of same package");
		Day12AccEmployeeEncChild obj2 = new Day12AccEmployeeEncChild();
		
		obj2.setsal(2000);
		obj2.setdesignation("manager");
		obj2.bonusCalculator();
		
		System.out.println("Now working with child class object of different package");
		Day12HREncChild obj3 = new Day12HREncChild();
		obj3.setsal(3000);
		obj3.setdesignation("manager");
		obj3.bonusCalculator();

	
		
	}

}

