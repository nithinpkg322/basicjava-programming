package companyquestions;
import java.util.Scanner;

public class sumofallprimeno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int s1=s.nextInt();
		int s2=s.nextInt();
		int i,j,flag=0,sum=0;
		for(i=s1;i<s2;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
					}
				else
					flag=1;
			}
				if(flag==1)
				{
					sum=sum+i;
				}
				}
		
		
		System.out.println(sum);
		
	}
}
