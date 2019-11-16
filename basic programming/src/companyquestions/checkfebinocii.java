package companyquestions;
import java.util.Scanner;

public class checkfebinocii {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = 0;
		System.out.println("Enter the number");
		
		int number=s.nextInt();
		int a=0,b=1,c=0;
		int i=0,flag=0;
		System.out.printf(" %d  %d ",a,b);
		
		for(i=3;i<=n;i++) {
			c=a+b;
		System.out.printf(" %d ",c);
		if(number==c)
		{
			flag=1;
			}
		a=b;
		b=c;
		}
		if(flag==1||number==a||number==b)
			System.out.println("\nnumber is febinocii");
		else
			System.out.println("\nnumber is not febinocii");
	}

}
