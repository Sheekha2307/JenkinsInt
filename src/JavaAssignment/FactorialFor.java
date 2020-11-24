package JavaAssignment;

import java.util.Scanner;

public class FactorialFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		System.out.println("Please enter number for factorial ");
		int number = num.nextInt();
		
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
 
		
	}

}
