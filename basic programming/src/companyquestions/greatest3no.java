package companyquestions;
import java.util.Scanner;

public class greatest3no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=s.nextInt();
		System.out.println("enter the second number");
		int b=s.nextInt();
		System.out.println("enter the third number");
		int c=s.nextInt();
		
		if(a>b && a>c)
		{
		 System.out.println("large" +a);
		}
		if(b>c && b>a)
		{
			 System.out.println("large" +b);
		}
			 else
			 {
				 System.out.println("large" +c);	 
			 }
		}

	}


