package Misc;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			assert false;
			System.out.println("a");
		}
		catch(Error e)
		{
			System.out.println("e");
			throw new Exception();
			
		}
		finally 
		{
			System.out.println("f");
		}
		
		

	}

}
