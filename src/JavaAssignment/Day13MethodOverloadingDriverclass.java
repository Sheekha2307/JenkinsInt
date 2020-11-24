package JavaAssignment;

public class Day13MethodOverloadingDriverclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day13MethodOverloading obj = new Day13MethodOverloading();
		Day13MethodOverloadingParent obj1 = new Day13MethodOverloadingParent();
		obj1.print();
		obj.print(15,"Reyu"); //method of parent class having different order called by child object
		obj.print();
		obj.print(20);
		obj.print("Sheekha", 20); //method of child class called by child object
		Day13MethodOverloadingParent.printstatic(30, "Piyush", 20000);  //static method can be called by classname or by object
		obj.printstatic(10, "Reyu", 1500);
		
	}

}
