package exception_handling;

import java.util.Scanner;

public class qs2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		String st=null;
		System.out.println(st.length());
		}
		catch(Exception e)
		{
		System.out.println(e);
		}

	}

}
