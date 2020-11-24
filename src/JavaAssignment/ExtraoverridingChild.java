package JavaAssignment;

public class ExtraoverridingChild extends ExtraoverridingBase {

	public ExtraoverridingChild()
	{
		System.out.println("This is child class constructor");
	}
	//overridden method
	public void printnum(int a)
	{
		System.out.println("value of private variable in child is" +a);
	}
	public static void printstatic(int a)
	{
		/* as b is non static instance variable, hence acnnot use it here
		 * int d= b+20 ; System.out.println("value of private variable in base is" +b);
		 */
		int d= a+10;
		System.out.println("value of d in static method of child class is "+d);
		
	}
	//Overridden method
	public ExtraoverridingChild printString()
	{
		System.out.println("This method returns object of child class");
		return new ExtraoverridingChild(); //here as we have defined base constructor, hence after above line, base constructor will be called
		
	}
	//cannot override final method error is displayed if exactly same final method is created
	/*
	 * final public void printStringFinal(String s) {
	 * 
	 * System.out.println("value of private variable in base is" +s); }
	 */
}
