package JavaAssignment;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleConstructor obj = new MultipleConstructor();
		int i = 60;
		System.out.println("value of i in class" +obj.i); //this will call instance variable and not variable inside default constructor
		System.out.println("value of j in class" +obj.j);
		System.out.println("Valie of k in class " +obj.k);
		System.out.println("Value of local variable i is " +i);
		
	}

}


//Constructor can take values directly from instance variable and if variables are declared within constructor then it will take variable in constructor (i)