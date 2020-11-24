package JavaAssignment;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner blooddonation = new Scanner(System.in);
		System.out.println("Please enter age " );
		int age = blooddonation.nextInt();
		System.out.println("Please enter weight ");
		int weight = blooddonation.nextInt();
		if(age >= 18 && weight >=50)
		{
			System.out.println("You are eligible for Blood Donation");
		}
		else
		{
			System.out.println("You are not eligible for blood donation");
		}
		
	}
	}

