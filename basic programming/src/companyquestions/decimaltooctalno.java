package companyquestions;

import java.util.Scanner;

public class decimaltooctalno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rem;
		String str="";
		char dig[]= {'0','1','2','3','4','5','6','7'};
		while(num>0)
		{
			rem=num%8;
			str=dig[rem]+str;
			num=num/8;
		}
		System.out.println("Decimal to octal:"+str);

	}

}
