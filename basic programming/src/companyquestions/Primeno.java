package companyquestions;
import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,flag=0;
		System.out.println("enter the number");
		int num=s.nextInt();
		if(num==0 || num==1 ) {
			flag=1;

		}
			
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
				}
		}
		if(flag==0)
		{
			System.out.println("prime number");
		}
			else {
				System.out.println("not prime number");		
				
		}

	}

}
