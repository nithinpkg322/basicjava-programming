import java.util.Scanner;

public class fibinociiserios {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		int c;
		
		for(int i=3;i<=n;i++)
		{
			c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		
			
		}
			
	}	

	}


