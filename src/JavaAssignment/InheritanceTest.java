//Base class of InheitanceTestChild

package JavaAssignment;

public class InheritanceTest {
	int i=110;
	private int j = 220;
	protected int k =330;
	final int u = 200;
	//System.out.println(" This is parametrised construcror with 1 value" +i);--- not accepted
		
	public InheritanceTest() throws InterruptedException
	{
		System.out.println("This is deafult constructor");
		System.out.println(i);
		
		System.out.println("final value is " +u);
	}
	public InheritanceTest(int i)
	{
		System.out.println(" This is parametrised construcror with 1 value" +i); //value passed during object initialisation will be displayed here
	}

	public InheritanceTest (String s)
	{
		System.out.println(" This is parametrised construcror with String value" +s);
	}
	
	protected InheritanceTest(int i, int j)
	{
		System.out.println(" This is parametrised construcror with 2 value" +i+ " and "+j);
	}
	final public void printnum(int i, String s)
	{
	System.out.println("value of i is " +i+ " and value of string is "+s);	
	}
	
	public void printnum()
	{
		int i = 100;
		System.out.println("value of i in printnum method is "+i);
	}
	private void printstring()
	{
		String s = "Private String";
		System.out.println("Value of s in private method is "+s);
	}
	
	
}
