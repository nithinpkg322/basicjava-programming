package companyquestions;
import java.util.Scanner;

public class gcdnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=s.nextInt();
		System.out.println("enter the second number");
		int b=s.nextInt();
		int gcd=0;
		for(int i=1;i<=a*b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			
			}
		}
System.out.println("GCD: "+gcd);
	}

}
