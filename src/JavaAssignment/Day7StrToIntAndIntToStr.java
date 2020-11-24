package JavaAssignment;

public class Day7StrToIntAndIntToStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "505";
		//change string value to int in below two ways:
		Integer i = Integer.valueOf(s);
		int i1= Integer.parseInt(s);
			System.out.println(i);	
			System.out.println(i1);
			
			
			//change int value to string in below two ways:
			int x = 5;
			
			String s1 = String.valueOf(x);
			String s2 = Integer.toString(x);
			System.out.println(s1);
			System.out.println(s2);
			
	}

}
