package companyquestions;

import java.util.Scanner;

public class Encipherthegivencharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		int b=s.nextInt();
		int c=(int)a;
		int d=c+b;
		System.out.println((char)d);
		
		

	}

}
