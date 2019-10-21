package controlstructure;

import java.util.Scanner;

public class Fibcheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = s.nextInt();
		if(n==0) {
			System.out.println("yes");
	}
	int a = 0;
	int b = 1;
	int c = 0;
	int m = 0;
	for(int i=1;i<=100;i++)
	{
		c= a+b;
		if(a==n)
		{
			m++;
		}
		a=b;
		b=c;
	}
	if(m!=0)
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
}
		
	
}
