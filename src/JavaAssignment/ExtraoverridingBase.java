package JavaAssignment;

public class ExtraoverridingBase {
	static private int a= 10;
	protected int b;
	private String s = "Sheekha";
	
	public ExtraoverridingBase()
	{
		System.out.println("This is base constructor");
	}
	public void printnum(int a)
	{
		int c=this.a+a;
		System.out.println("value of private variable in base is" +c);
	}
	public static void printstatic(int a)
	{
		/* as b is non static instance variable, hence acnnot use it here
		 * int d= b+20 ; System.out.println("value of private variable in base is" +b);
		 */
		int d= a+10;
		System.out.println("value of d in static method of parent class is "+d);
		
	}
	public ExtraoverridingBase printString()
	{
		System.out.println("This method returns object of parent class");
		return new ExtraoverridingBase(); //here as we have defined base constructor, hence after above line, base constructor will be called
		
	}
	final public void printStringFinal(String s)
	{
		
		System.out.println("value of private variable in base is" +s);
	}
}
