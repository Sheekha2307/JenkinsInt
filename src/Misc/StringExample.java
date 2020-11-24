package Misc;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      String s1=new String("Hello");
		      String s2=new String("Hellow");
		      System.out.println(s1+s2);
		      String s3=null;
		      //System.out.println(s3.isEmpty());
		      String s4 = "      a";
		      System.out.println("s4 length before trimming is " +s4.length());
		      System.out.println(s4.trim());
		      s4=s4.trim();
		      System.out.println(s1.equalsIgnoreCase("")); //to check if string is empty without using emtpymethod
		      System.out.println("s4 value after trimming is " +s4);
		      String s5=new String("Hello");
		      String s6=new String("     Hello");
		      System.out.println(s5.equals(s6));
		      StringBuffer sb = new StringBuffer("deepak java");
		      System.out.println(sb.delete(2, 5));
		      System.out.println(sb);
		   }
			}


