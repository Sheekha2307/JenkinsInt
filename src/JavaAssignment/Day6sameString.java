package JavaAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Day6sameString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter string 1: ");
		String s1 = obj.next();
		System.out.println("Please enter string 2: ");
		String s2 = obj.next();
		/*
		 * String s1 = "SILENT"; String s2 = "LISTEN";
		 */
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if (Arrays.equals(c1, c2))
		{
			System.out.println("two strings are having same characters"); //anagrams
		}
		else
		{
			System.out.println("two strings are not having same characters");
		}
	}

}
