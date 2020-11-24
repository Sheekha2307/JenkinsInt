package JavaAssignment;

public interface Interface1 {
	public class InnerClass1{
		int d = 10;
		void printnumInner()
		{
			d= d+10;
		System.out.println("This is nested class " +d);
		}
	}
	public interface InnerInterface1{
		private void innershow()
		{
			System.out.println("What is this happening");
		}
		
	}
	int a=10; //public static final
	void show(); //public abstract
	default void display()
	{
		int b = 10; //in local variable, action cannot be performed unless variable is initialtized. either int b; is correct or these two lines in the code is corredt
		b= b+10;
		System.out.println("I am default method of interface and local variable value is " +b+ " and instance variable value is " +a);
	}
	public static void printnum()
	{
		int c;
		System.out.println("I am public static method of interface");
	}
	private void test()
	{
		System.out.println("This is private method of interface");
	}

}
