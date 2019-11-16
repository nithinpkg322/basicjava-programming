package companyquestions;

import java.util.Scanner;

public class Armstrongno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a;
		int m,n=0;
		while(a!=0)
		{
			m=a%10;
			n=(m*m*m)+n;
			a=a/10;
		}
		if(n==b)
			System.out.println("armstrong");
		else
			System.out.println("not a armstrong");
			
			
		}
		

	}


