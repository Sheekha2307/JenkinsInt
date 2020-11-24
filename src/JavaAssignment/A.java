package JavaAssignment;

public class A {
	public A()
	{
		System.out.println("This is A");
	}
}
class B extends A{
		public B()
		{
			System.out.println("This is B");
		}	
	}
	class C extends B {
			public C(int a)
			{
			super();
				System.out.println("This is c");
			}	
			public void display()
			{
				System.out.println("Method");
			}
	}
class test{
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj1 = new C(10);
		obj1.display();
		
	}
}
		

