package companyquestions;

import java.util.Scanner;

public class nthprimenum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=1,count=0,i;
		System.out.println("enter the number");
		int n=s.nextInt();
		while(count<n)
		{
			num=num+1;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					break;
					}
				}
			if(i==num)
			{
				count=count+1;
			}
		}
		System.out.println("value of nth prime is"+num);
		
			}
		

	}


