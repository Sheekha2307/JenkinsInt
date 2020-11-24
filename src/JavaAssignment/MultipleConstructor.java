package JavaAssignment;

public class MultipleConstructor {
	
	int i = 10;
	static int j =20;
	final int k= 30;
	

	public MultipleConstructor()
	{
		System.out.println("This is default constructor");
		int i =25;
		i=i+i;
		System.out.println("Value of i in default constructor is " +i);
		System.out.println("Value of final variable is "+k);
	}
	
	public MultipleConstructor(int i)
	{
		int j =35;
		System.out.println("value of parametised first constructor "+i+ "and " +j );
	}

	public MultipleConstructor(String s)
	{
		String s1 = "3rd constructor";
		System.out.println("value of parametised first constructor "+s+ "and " +s1 );
	}
}
