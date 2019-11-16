package companyquestions;

import java.util.Scanner;

public class Changethecaseofthegivenalphabet {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c=s.next().charAt(0);
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
