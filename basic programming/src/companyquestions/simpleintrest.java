package companyquestions;

import java.util.Scanner;

public class simpleintrest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int n=s.nextInt();
		float r=s.nextFloat();
		double intrest = p*n*r/100;
		System.out.println(intrest);
		
	}
	

}
