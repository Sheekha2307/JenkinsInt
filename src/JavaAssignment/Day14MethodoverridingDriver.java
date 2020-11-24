package JavaAssignment;

public class Day14MethodoverridingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day14MethodoverridingBase base = new Day14MethodoverridingBase();
		Day14MethodoverridingChild child = new Day14MethodoverridingChild();
		Day14MethodoverridingBase child1 = new Day14MethodoverridingChild();
		child1.printstatic(); //dynamic method dispatch- method of parent is called by child object 
		base.print(10);
		base.print("parent");
		base.print("parent1", "s2");
		base.printstatic();
		//base.print(30, 40, 50);
		child.print(10, 20, 30);
	child1.print(10);//this will print child method
	child1.printstatic(); // this will print parent method
	
	/*
	 * methodoverload child3 = new childdemo();
	 * 
	 * child3.print(10, "jdsks");// non static - dynamic method dispatch
	 * 
	 * child3.printstatic(10, 20); // method hiding
	 */
	}

}
