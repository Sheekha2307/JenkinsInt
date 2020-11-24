package JavaAssignment;

public class ExtraOverridingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtraoverridingBase obj1 = new ExtraoverridingBase();
		ExtraoverridingBase.printstatic(10);
		obj1.printstatic(10);
		obj1.printString();
		obj1.printnum(30);
		System.out.println("Now calling methods by child object");
		ExtraoverridingChild obj2 = new ExtraoverridingChild();
		obj2.printstatic(55); //child method
		obj2.printnum(20); //child method
		obj2.printString(); //child method
		obj2.printStringFinal("Reyansh"); //base method
		System.out.println("Now calling methods by child object by giving parent class reference");
		ExtraoverridingBase obj3 = new ExtraoverridingChild();
		obj3.printstatic(33);; //base method
		obj3.printnum(22);; //shows base method on compile time but on run time shows result of child method
		obj3.printString(); //shows base method on compile time but on run time shows result of child method
		obj3.printStringFinal(null); //base
		
		
		
	}

}
