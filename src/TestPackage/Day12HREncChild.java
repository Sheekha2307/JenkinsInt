package TestPackage;

import JavaAssignment.Day12EmployeeEnc;

public class Day12HREncChild extends Day12EmployeeEnc {

	public String getname()       //string method as void method cannot return value
	{
		return Employee_name;
		
	}
	/*
	 * public int getid() //private variable, hence cannot be accessed { return
	 * Employee_id;
	 * super.Employee_id; }
	 */
	
	/* cannot access default variable
	 * public double getsal() { return Employee_salary; }
	 */
	public String getdesignation()
	{
		return Employee_designation;
	}
	public void setname(String Newname)
	{
		Employee_name= Newname;
	}

	/*//private method, hence cannot be accessed
	 * public void setid(int newId) { Employee_id = newId; }
	 */
	
	/*
	 * cannot access default variable public void setsal(double newSal) {
	 * Employee_salary = newSal; }
	 */

	
	  public void setdesignation(String newdesign)
	  { 
		  Employee_designation = newdesign;
	  }

}
