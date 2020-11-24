package Misc;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sheekha";
		int length= s.length();
		String reverse = "";
		for (int i=length-1; i>=0; i--)
		{
			//System.out.println("Char at "+s.charAt(i));
			reverse = reverse+s.charAt(i);
		}
		System.out.println("reverse string is "+reverse);
		StringBuffer sb = new StringBuffer("Sheekha");
		StringBuffer reverseByStringBuffer = sb.reverse();
		System.out.println("Reverse by String Buffer value is "+reverseByStringBuffer);
				
		String s7 = "This is to replace space";
		s7=s7.replaceAll("\\s", "&");
		System.out.println(s7);
		
	}

}
