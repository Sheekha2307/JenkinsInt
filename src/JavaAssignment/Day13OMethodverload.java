package JavaAssignment;

public class Day13OMethodverload {
	
	public void print()
	{
		System.out.println("Normal method");
	}
	public void print(int a, int b)
	{
		int c= a+b;
		System.out.println("Value of c is "+c);
	}
	public void print(String a)
	{
		a= "Sheekha";
		System.out.println("string value is "+a);
		
	}
	/* This is wrong way
	 * private void print(String b) {
	 * 
	 * }
	 */
	public void print(String a, int b)
	{
		a= "Sheekha";
		b=2;
		System.out.println("string value is "+a+ "int value is" +b);
	}
	public void print(int b, String a)
	{
		a= "Sheekha Jain";
		b=3;
		System.out.println("string value is "+a+ "int value is" +b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method");
Day13OMethodverload obj = new Day13OMethodverload();
obj.print();
obj.print("Meghna"); //value in local variable will be considered, not this one
obj.print(8, 7);
obj.print(7, "Meghna jain");
obj.print("Sheekha Agrawal", 6);
obj.main(10);

	}
	
	public static void main(int a)
	{
		a=9;
		System.out.println("value of a" +a);
	}

}
