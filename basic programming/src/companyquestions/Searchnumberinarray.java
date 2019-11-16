package companyquestions;

import java.util.Scanner;

public class Searchnumberinarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");

		int n=s.nextInt();
		int a[]=new int[n];
		int c =0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the search");

		int search=s.nextInt();

		for(int i=0;i<n;i++)
		{
			if(a[i]==search)
		{
				c++;
		}
		}

			if(c!=0)
			{
				System.out.println("search num available in array");
			}
			else
			{
				  
				System.out.println("search num not available in array");
				
			}
				
		}

	}

