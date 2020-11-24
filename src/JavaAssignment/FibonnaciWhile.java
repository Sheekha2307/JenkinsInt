package JavaAssignment;

public class FibonnaciWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		int i =1;
        while(i <= 5)
        {
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
       
		
	}

}
