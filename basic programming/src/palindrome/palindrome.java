package palindrome;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int a,sum=0,i=0;
        int temp=n;
        while(n!=0)
        {
        	a=n%10;
        	sum=sum*10+a;
        	n=n/10;
        	 }
        if(temp==sum) {
        System.out.println("number is palindrome");}
        else {
        	System.out.println("number is not palindrome");}
	
	
		}
	}


