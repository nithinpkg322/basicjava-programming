package arrays;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
        int n = s.nextInt();
      
        int f;
        int sum=0;
        int r;
        int num=n;
        while(n!=0)
        {
        	f=1;
        	r=n%10;
        	for(int i=1;i<=r;i++)
        	{
        	f=f*i;
        	}
        	sum=sum+f;
        	n/=10;
        }
        if(sum==num)
        
        	System.out.println("strong number");
        	else
        		System.out.println("not strong number");
        s.close();
        	
        }
        

	}


