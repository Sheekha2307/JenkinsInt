package JavaAssignment;

public class ScopeOfVariable {

	static int i=25;           //static because main method is static hence all variable needs to be static if directly called
	//if you dont want to use static then call this variable by object ie syso(obj.i) in main method
	public ScopeOfVariable()
	{
		System.out.println("This is default constructor");
		int i= 10;											//This is also local variable as constructor is also a method
		System.out.println("Class variable value is " +i);
		
	}

	public void printnum()
	
	{
		String s= "Sheekha is great";
		System.out.println("String is "+s);
		int i=20;
		System.out.println("Int inside printnum " +i);
	}

	public static void main (String args[])
	{
		ScopeOfVariable obj = new ScopeOfVariable();
		obj.printnum();						//Here for methods we don't need static because for method we are calling with object
		System.out.println("value of i inside constructor " +i);
	}
}
