package Strings;

import java.util.Scanner;

public class sr4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.nextLine();
		int vow=0,cons=0,dig=0,sp=0,low=0,up=0,space=0;
		int i,len=str.length();
		for(i=0;i<len;i++)
		{
		char c= str.charAt(i);
		if(c>='A' && c<='Z')
		{
		up++;
		}
		if(c>='a' && c<='z')
		{
		low++;
		}
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
		{
		vow++;
		}
		else if(c>='0' && c<='9')
		{
		dig++;
		}
		else if(c=='@' || c=='#' || c=='&' || c=='$')
		{
		sp++;
		}
		else if(c==' ')
		{
		space++;
		}
		else
		{
		cons++;
		}


		}
		System.out.println("Vowel : "+vow);
		System.out.println("Consonant : "+cons);
		System.out.println("Digit : "+dig);
		System.out.println("White space : "+space);
		System.out.println("Special symbol : "+sp);
		System.out.println("Uppercase : "+up);
		System.out.println("Lowercase : "+low);

		}
}