package JavaAssignment;

public class Day12EmployeeEnc {
	protected String Employee_name;
	private int Employee_id;
	double Employee_salary;
	public String Employee_designation;

	public String getname()       //string method as void method cannot return value
	{
		return Employee_name;
	}
	public int getid()
	{
		return Employee_id;
	}
	public double getsal()
	{
		return Employee_salary;
	}
	public String getdesignation()
	{
		return Employee_designation;
	}
	public void setname(String Newname)
	{
		Employee_name= Newname;
	}
	public void setid(int newId)
	{
		Employee_id = newId;
	}
	public void setsal(double newSal)
	{
		Employee_salary = newSal;
	}

	
	  public void setdesignation(String newdesign)
	  { 
		  Employee_designation = newdesign;
	  }
	 
	public void bonusCalculator()
	{
		if (Employee_designation.equalsIgnoreCase("Manager"))
		{
			
			double increment = (Employee_salary* 10)/100;
			double new_salary = Employee_salary + increment;
		System.out.println("Manager's salary is "+new_salary);

		}	
		else if (Employee_designation.equalsIgnoreCase("Associate"))
		{
			
			double increment = (Employee_salary* 8)/100;
			double new_salary = Employee_salary + increment;
		System.out.println("Associate's salary is "+new_salary);

		}
		else if (!Employee_designation.equalsIgnoreCase("manager") && !Employee_designation.equalsIgnoreCase("Associate"))
		{
			
			double increment = (Employee_salary* 3)/100;
			double new_salary = Employee_salary + increment;
		System.out.println("Other's salary is "+new_salary);

		}
		
		else
	{
		System.out.println("wrong code");
	}
}
}
