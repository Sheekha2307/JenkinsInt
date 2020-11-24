//Pyramid

package JavaAssignment;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter count for star pattern ");
		int count = num.nextInt();
		
		
		for (int i=1; i<=count; i++)
		{
			for (int j=count; j>=i; j--)
			{
				System.out.print(" ");
			}
				for (int k= 1; k<=i; k++)
				{
					System.out.print(" *");
				}
				System.out.println();
			
		}
	}
}
