package Strings;

import java.util.Scanner;

public class casestudy4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st= "qwertyuiop asdfghjkl; zxcvbnm,.";
	    char c;
		String str;
		int i,j;
		System.out.println("Enter a character");
		c=s.next().charAt(0);
		System.out.println("Enter String");
		str=s.next();
		System.out.println("Original message");
		for(i=0;i<str.length();i++)
		{
		    for(j=0;j<st.length();j++)
		    {
		        if(str.charAt(i)==st.charAt(j)&&c=='R')
		        {
		            System.out.print(st.charAt(j-1));
		        }
		        if(str.charAt(i)==st.charAt(j)&&c=='L')
		        {
		            System.out.print(st.charAt(j+1));
		        }
		}}
		
	}
}
	
		
