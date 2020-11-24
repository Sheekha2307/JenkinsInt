package JavaAssignment;

import JavaAssignment.Interface2.interface2Class;

//import JavaAssignment.Interface1.InnerClass1;


public class InterfaceDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 InterfaceClass obj = new InterfaceClass();
 obj.show();
 obj.display();
 obj.printnum();
 
 Interface1 obj1 = new InterfaceClass();
 obj1.show();
 obj1.display();
 Interface1.printnum(); //as printnum is static method hence can be called by classname in this case
 
 System.out.println("This is interface extending interface");
 //Interface1.InnerInterface1 obj2 = new Interface1.InnerInterface1(); cannot instantiate interface
 Interface2.interface2Class obj2 = new Interface2.interface2Class(); 
 obj2.dispalyInterface();
 
		 
System.out.println("Accessing inner class of interface1");	 
 Interface1.InnerClass1 t2 = new Interface1.InnerClass1();//(way 1)- Innerclass calling
 //InnerClass1 t1 = new InnerClass1(); //(way 2)if we are directly accessing inner class, then we need to access outer interface for which we need to import the package
// t1.printnumInner();
 t2.printnumInner();
 
 
	}

}
