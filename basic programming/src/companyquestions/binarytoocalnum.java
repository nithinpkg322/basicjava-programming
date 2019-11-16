package companyquestions;

import java.util.Scanner;

public class binarytoocalnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int binary =s.nextInt();
		int r,temp=0;
		int i=1;
		temp=binary;
		while(temp!=0)
		{
			a[i++]=temp%8;
			temp=temp/8;
		}
		for(int j=i-1;j>0;j--)
		{
			System.out.println(a[i]);
		}
	}
			
		
	}


