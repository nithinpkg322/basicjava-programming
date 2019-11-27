package serious;

import java.util.Scanner;

public class qs2 {

	public static void main(String[] args) {
		
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i=0;
      int sm1=7,sm2=0;
      for(i=0;i<n;i++)
      {
    	  sm1=sm1+4;
    	  System.out.print(sm1*sm1+" ");
      }
	}

}
