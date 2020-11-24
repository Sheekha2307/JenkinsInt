package JavaAssignment;

public class Day8ReverseStringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		String s2 = "World";
		StringBuffer sb = new StringBuffer("Hello World");
		System.out.println("String before reversal by String Buffer " +sb);
		StringBuffer s3 = sb.reverse();
		System.out.println("String after reversal by String Buffer " +s3);
		StringBuilder sb1 = new StringBuilder("Hello String");
		System.out.println("String before reversal by String Builder " +sb1);
		StringBuilder s4 = sb1.reverse();
		System.out.println("String after reversal by String Builder class " +s4);
	}

}
