package JavaAssignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Get input from user
		Scanner leapyear = new Scanner (System.in);
		System.out.println("Please enter year to validate if it is leap year or not: ");
		int year = leapyear.nextInt();
		System.out.println("year " +year);
		if ((year % 4 ==0 && year % 100 != 0 ) || (year % 400 == 0))
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
	}

}
