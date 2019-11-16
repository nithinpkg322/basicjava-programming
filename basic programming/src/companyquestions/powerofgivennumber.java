package companyquestions;

import java.util.Scanner;

public class powerofgivennumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int base=s.nextInt();
		int expo=s.nextInt();
		int result=1;
		while(expo!=0) 
		{
			result=result*base;
			expo--;
			}
		System.out.println(result);
		
	}

}
