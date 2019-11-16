package companyquestions;
import java.util.Scanner;

public class perfectno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
				}
		if(n==sum)
		{
			System.out.println("perfect no");
		}
		else
		{
			System.out.println("not perfect no");
		}
		
		

	}

}
