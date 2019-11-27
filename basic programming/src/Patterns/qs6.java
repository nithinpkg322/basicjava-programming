package Patterns;

import java.util.Scanner;

public class qs6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=65;
		for(int i=0;i<n;i++)
		{
	    for(int j=0;j<=i;j++)
	    {
	    	System.out.printf("%c",count);
	    	count++;
	    	 }
	    System.out.println();
		}

	}

}
