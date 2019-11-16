package companyquestions;

import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a = "";
		int n=s.nextInt();
		int r=0;
		while(n>0)
		{
			r=n%2;
			a=r+a;
			n=n/2;
			}
		System.out.println(a);

	}

}
