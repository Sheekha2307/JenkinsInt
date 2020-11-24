package JavaAssignment;

public class Day14MethodoverridingBase {

	
	public void print(int a)
	{
		
		System.out.println("Value of a is "+a);
	}
	private int print(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of two integers is "+c);
		return c;
	}
	public int print(int a, int b, int c, int d)
	{
		int e = a+b+c+d;
		System.out.println("sum of all integers is "+e);
		return e;
	}
	public long print(long a, long b, long c, long d, String s)
	{
		long e = a+b+c+d;
		System.out.println("sum of all integers is "+e);
		return e;
	}
	protected void print(String s)
	{
		System.out.println("String value is " +s);
	}
	final public String print(String s1, String s2)
	{
		System.out.println("String1 value is "+s1+ "String2 value is "+s2 );
		return s1;
	}
	public static void printstatic()
	{
		System.out.println("This is base class");
	}
	public void print(int a, int b, int c)
	{
		c = a+b;
		System.out.println("sum of two integers is "+c);
	}
}
