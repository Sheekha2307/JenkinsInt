package JavaAssignment;

public class InterfaceClass implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		System.out.println("This is child class");
	}
	public void display()   //default needs to be replaced by public
	{
		int b = 10; 
		b= b+10;
		System.out.println("I am in child and local variable value is " +b+ " and instance variable value is " +a);
	}
	public static void printnum()
	{
		int c;
		System.out.println("I am public static method of child class");
	//	InnerClass1 obj1 = new InnerClass1(); calling inner class of interface (way3)
		
	}

}
