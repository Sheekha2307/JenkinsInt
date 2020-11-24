package Misc;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Removing char at 7th index
		String s = "India is my Country";
		s=s.substring(0, 7)+s.substring(8, s.length());
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("India is my Country");
		sb.deleteCharAt(7);
		System.out.println(sb);
	}

}
