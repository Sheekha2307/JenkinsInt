package JavaAssignment;

public class CheckException {
	
	public String checkException()
	{
		try
		{
			int i = 10/0;
			System.out.println("This is try block");
			return "Ashwini";
		}
		catch (Exception e)
		{
			System.out.println("Exception catch block");
			e.printStackTrace();
			System.out.println(e.getMessage());
			return "nandu";
		}
		finally
		{
			System.out.println("Finally block");
			return "Sheekha";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckException e = new CheckException();
System.out.println(e.checkException());
	}

}
