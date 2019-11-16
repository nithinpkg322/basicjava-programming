package companyquestions;

import java.util.Scanner;

public class VowelsConsonantsUppercase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("consonant");
			
		}
		if(c>='a'&&c<='z')
		{
			c=(char)((int)c-32);
		}
		else
		{
			c=(char)((int)c+32);	
		}
	     System.out.println(c);

	}

}
