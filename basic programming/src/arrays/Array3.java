package arrays;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size: ");
		int size = s.nextInt();
		int[]values =new int[size];
		System.out.println("enter the elements ");
		for(int i=0;i<size;i++)

			values[i]=s.nextInt();
			int max=0;
			for(int i=0;i<size;i++)
			{
				if(values[i]>max)
				{
					max=values[i];
				}
			}
			System.out.println(max);
		}

	}

