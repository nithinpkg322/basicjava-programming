package Patterns;

import java.util.Scanner;

public class qs5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
	    for(int j=0;j<=i;j++)
	    {
	    	System.out.printf("%c",j+65);
	    	 }
	        
            System.out.println();
	}
		}
	}
