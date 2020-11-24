package Misc;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "DAD";
		int length= s.length();
		String reverse = "";
		for (int i=length-1; i>=0; i--)
		{
			reverse = reverse+s.charAt(i);
		}
		if(s.equalsIgnoreCase(reverse))
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not palindrome");
		}
		StringBuffer sb = new StringBuffer("Sheekha");
		StringBuffer reverseByStringBuffer = sb.reverse();
				
		  if(!sb.equals(reverseByStringBuffer)) {
		  System.out.println("This is palindrome (checked by String Buffer)"); }
		  else
		  {
			  System.out.println("This is not palindrome (Checked by String Buffer)");
		  }
		 		
	}

}
