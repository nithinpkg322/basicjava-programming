package serious;

import java.util.Scanner;

public class qs1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         int a=s.nextInt();
         int b=1;
         for(int i=1;i<=a;i++)
         {
        	 if(i%2==0) 
        	 {
        		 b=(i*i)-2;
        	 }
        	 else
        	 {
        		 b=(i*i)-1;
        	 }
        	 System.out.print(b+" ");
        	 }
         }
	}


