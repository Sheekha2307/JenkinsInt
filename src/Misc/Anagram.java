package Misc;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args)
	{
		String s1 = "Listen";
		String s2 = "Silent";
		char [] c1 =s1.toCharArray();
		char [] c2 =s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		int n1 = c1.length;
		int n2 = c2.length;
		boolean result = true;
		if (n1!=n2)
		{
			System.out.println("Count of char is not same");
		}
		for (int i=0; i<n1; i++)
		{
			if(c1[i]!=c2[i])
			{
				result=false;
			}
			
		}
		if (result = true)
		{
			System.out.println("This is anagram");
		}
		}
			
		
	}
