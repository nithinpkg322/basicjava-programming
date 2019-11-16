package companyquestions;

import java.util.Scanner;

public class Lcmof2no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int lcm=0;
		int max=a>b?a:b;
		for(int i=max;i<=(a*b);i++)
		{
			if(i%a==0 && i%b==0)
			{
				 lcm =i;
				break;
				}
			}
			System.out.println(lcm);
		

	}

}
