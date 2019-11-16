package companyquestions;

import java.util.Scanner;

public class sumofdigitsinsingledigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a1=0;
		int a=0;
		int sum = 0,sum1=0;
		while(n!=0)
		{
			 a=n%10;
			sum=sum+a;
			n=n/10;
			}
		while(sum>9)
		{
			 a1=sum%10;
			sum1=sum1+a1;
			sum=sum/10;
		}
		System.out.println(sum1+sum);
		

	}

}
