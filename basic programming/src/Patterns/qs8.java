package Patterns;

import java.util.Scanner;

public class qs8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		int n=st.length();
		char a[]=st.toCharArray();
		for(int i=0;i<n;i++)
		{
	    for(int j=0;j<=i;j++)
	    {
	    	
	    	System.out.print(a[j]);
	    	 }
	        
            System.out.println();
	}
		}

	}


