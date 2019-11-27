package Patterns;

import java.util.Scanner;

public class qs14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(" ");
				}
			for(int k=0;k<(2*i)+1;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
