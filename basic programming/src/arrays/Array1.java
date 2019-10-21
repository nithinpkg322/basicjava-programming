package arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int i = s.nextInt();
		int size = s.nextInt();
		int[] values=new int[size];
		int sum = 0;
		for(i=0;i<size;i++);
		{
			System.out.println("enter the index["+i +"]");
			values[i]=s.nextInt();
			sum=sum+values[i];
			
		}
		System.out.println(sum);
					
			
		}
		
		
	}


