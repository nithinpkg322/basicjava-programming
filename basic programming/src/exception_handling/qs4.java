package exception_handling;

public class qs4 {

	public static void main(String[] args) {
		try
		{
			String st="abc";
			int a=Integer.parseInt(st);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally {
			System.out.println("pgm closed");
		}

	}

}
