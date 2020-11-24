package JavaAssignment;

public class FibonnaciFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
        for(int i = 1; i <= 5; i++)
        {
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }  
	}
}
