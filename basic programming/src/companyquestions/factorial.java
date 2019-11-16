package companyquestions;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int f=1;
		while(i<=n)
		{
			f=f*i;
			i++;
			}
		System.out.println(f);

	}

}
