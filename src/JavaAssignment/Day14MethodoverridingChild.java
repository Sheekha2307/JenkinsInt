package JavaAssignment;

public class Day14MethodoverridingChild extends Day14MethodoverridingBase {

	//exactly same method as base
	public void print(int a)
	{
		
		System.out.println("Value of a in child method is "+a);
	}
	
	//changed to long from int of parent -- but this is not seen while invoking method in driver class as it is private method
	private long print(long a, long b)
	{
		long c = a+b;
		System.out.println("sum of two integers is "+c);
		return c;
	}
	//changed to long from int of parent
	public long print(long a, long b, long c, long d)
	{
		long e = a+b+c+d;
		System.out.println("sum of all integers is "+e);
		return e;
	}
	//changed to int from long of parent
	public int print(int a, int b, int c, int d, char s)
	{
		int e = a+b+c+d;
		System.out.println("sum of all integers is "+e);
		return e;
	}
	
	/*
	 * changed visibility from protected of parent to private-- cannot be done as visibility is reduced
	 *  private void print(String s) { System.out.println("String value is " +s); }
	 */	
	
	//changed visibility from protected to public--accepted
	public void print(String s)
	{
		System.out.println("String value is " +s);
	}
	//changed to char from string of parent--but as this is final hence only parent final class is invoked in driver class
	final public char print(char s1, char s2)
	{
		System.out.println("char1 value is "+s1+ "char2 value is "+s2 );
		return s1;
	}
	
	//keep as it to check dynamic method dispatch
	public static void printstatic()
	{
		System.out.println("This is child class");
	}
	//changed return type from void to long and data type argument from int to long. child object will be able to access both int and long data type and paent object will be able to access int
	public long print(long a, long b, long c)
	{
		c = a+b;
		System.out.println("sum of two integers is "+c);
		return c;
	}
	public void printchild(long a, long b, long c)
	{
		c = a+b;
		System.out.println("sum of two integers is "+c);
		return;
	}
}
