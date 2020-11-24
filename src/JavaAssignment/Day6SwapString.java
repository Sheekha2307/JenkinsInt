package JavaAssignment;

public class Day6SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello";
		String s2 = "World";
		
		System.out.println("Initial value of s1 is "+s1);
		System.out.println("Initial value of s2 is "+s2);
		
		//append s1 and s2
		s1= s1+s2;
		
		//store s2 value in s1
		s2= s1.substring(0, s1.length()-s2.length());
		
		
		s1 = s1.substring(s2.length());
		System.out.println("swapped value of s1 is "+s1);
		System.out.println("swapped value of s2 is "+s2);
				
	}

}
