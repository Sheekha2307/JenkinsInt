package JavaAssignment;

public class StaticFinal {
	
	int i=30;
	static int j=20;
	final int k = 10;
	String s = "non-static string";
	static String s1 = "static string";
	final String s2 = "Final string";
	public void printnum()				//static method accepts only static variable but non-static method can be used for all types of variable
	{
		i = i+i;
		j= j+j;
		//k=k+k;--- cannot be done as final cannot be called
		
		System.out.println("non-static value " +i);
		System.out.println("static value  "+j);
		System.out.println("final value "+k);
		
		i= i+i;
		j=j+j;
		System.out.println("non-static string value " +s);
		System.out.println("static string vale " +s1);
		System.out.println("Final string value " +s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticFinal obj1 = new StaticFinal ();
		// obj1.i; - cannot do this as u need to store it in variable or in method. hence below two ways can be used
		int i1 = obj1.i;
		System.out.println(obj1.i);
		//non-static variable. u cannot call static variable through object directly
		//obj1.k;
		String s1 = obj1.s;
		System.out.println(obj1.s);
		
		String s = obj1.s; //non-static variable
		String s2= obj1.s2;
		obj1.printnum();
		System.out.println(StaticFinal.j);
		System.out.println(StaticFinal.s1);
		
	}

}

//try above with constructor
