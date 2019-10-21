package decisionmaking;

import java.util.Scanner;

public class Fallthr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = n%10;
		int b = n/10;
		int t = 0;
		if(b!=1)
		{
			switch(a)
			{
			case 1:
			case 2:
			case 6:
			case 10: t=t+3;
			break;
			case 4:
			case 5:
			case 9: t=t+4;
			break;
			case 3:
			case 8:
			case 7: t=t+5;
			break;
			}
			switch(b)
			{
			case 2:
			case 3:
			case 4:
			case 8:
			case 9: t=t+6;
			break;
			case 5:
			case 6: t=t+7;
			break;
			}
		}
			else {
				switch(a)
				{
				case 5:
				case 6: t=t+7;
				break;
				case 1:
				case 2: t=t+6;
				break;
				case 3:
				case 8:
				case 4:
					break;
				}
			}
			System.out.println(t);
			
					
					
				
				
			
		
		

	

}
}

