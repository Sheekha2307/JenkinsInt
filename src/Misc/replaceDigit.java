package Misc;

public class replaceDigit {

	char[] s;
	String str1;
	
	public String replaceInts(String str)
	{
		/*
		 * this.s= str.replaceAll("\\d", "*"); System.out.println(s); return s;
		 */
		this.s= str.toCharArray();
		for (int i=0; i<s.length; i++)
		{
			
			if(Character.isDigit(s[i])==true)
			{
				s[i]= '*';
				
			}
			str1=s.toString();
		}
		System.out.println(s);
	
		return str1;
		
		
		
	}
	public static void main(String[] args) {
		
        replaceDigit obj = new replaceDigit();
        obj.replaceInts("I will eat 2 burgers 23 fries & 1.25 cokes l8r");
			}

}
