package exception_handling;

public class qs3 {

	public static void main(String[] args) {
		int a=10;
		int b=12;
		if(a>b)
		{
				throw new ArithmeticException("B is greater");
				
		}
		else
		{
			throw new ArithmeticException("A is greater");
		}
	}

}
