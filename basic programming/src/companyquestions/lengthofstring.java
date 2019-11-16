package companyquestions;

import java.util.Scanner;

public class lengthofstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int l=0;
		for(char c:str.toCharArray())
		{
			l++;
		}
		System.out.println(l);
		
		
	}

}
