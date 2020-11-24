package JavaAssignment;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number = num.nextInt();
        int fact = 1;
        int i=1;
        while (i <= number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
 
		
	}

}
