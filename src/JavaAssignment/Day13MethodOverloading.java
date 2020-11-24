package JavaAssignment;

public class Day13MethodOverloading extends Day13MethodOverloadingParent{
	protected String Employee_name;
	private int Employee_id;
	double Employee_salary;
	public String Employee_designation;

	public void print()
	{
		System.out.println("This method is normal");
	}
	public void print(int i)
	{
		Employee_id = i;
		System.out.println("Employee id is "+Employee_id );
	}
	public void print (String a, int i)
	{
		Employee_name = a;
		Employee_id = i;
		System.out.println("Employee name is "+Employee_name+ "Employee id is "+Employee_id);
	}
	static public void printstatic(int Employee_id, String Employee_name, double Employee_salary)
	{
		System.out.println("Employee name of parent is "+Employee_name+ " Employee id is "+Employee_id+ "Employee salary is " +Employee_salary);
	}
	
}
