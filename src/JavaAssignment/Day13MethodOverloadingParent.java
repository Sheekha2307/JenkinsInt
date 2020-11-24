package JavaAssignment;

public class Day13MethodOverloadingParent {
	private String Employee_name;
	private int Employee_id;
	double Employee_salary;
	public String Employee_designation;
	static int Employee_rank;
	public void print()
	{
		System.out.println("This method is Parent's normal");
	}
	public void print(int i)
	{
		Employee_id = i;
		System.out.println("Employee id of parent is "+Employee_id );
	}
	/* invalid- different scope of variable
	 * static public void print(int Employee_rank ) {
	 * 
	 * System.out.println("Employee id of parent is "+Employee_rank ); }
	 */

	/*invalid- different access specifier
	 * private void print(int i) { Employee_id = i;
	 * System.out.println("Employee id of parent is "+Employee_id ); }
	 */
	/* invalid- different return type
	 * public int print(int i) { Employee_id = i;
	 * System.out.println("Employee id of parent is "+Employee_id ); return i; }
	 */
	public void print(int i, String a)
	{
		Employee_name = a;
		Employee_id =i;
		System.out.println("Employee name of parent is "+Employee_name+ "Employee id is "+Employee_id);
	}
	static public void printstatic(int Employee_id, String Employee_name, double Employee_salary)
	{
		System.out.println("Employee name of parent is "+Employee_name+ " Employee id is "+Employee_id+ "Employee salary is " +Employee_salary);
	}
}
