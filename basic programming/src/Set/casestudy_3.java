package Set;

import java.util.HashSet;
import java.util.Scanner;

public class casestudy_3 {

	public static void main(String[] args) {
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry=" ";
		String pro;
		Scanner sc=new Scanner(System.in);
		int total,b=0,c=0,d=0,e=0,f=0,i=1;
		do
		{
		System.out.println("Booking");
		System.out.println("please choose the service reqiured");
		System.out.println("Ac/non-Ac(Ac/nAc)");
		ac=sc.next();
		if(ac.equals("AC")==true)
		{
			b=1500;
		}
		else
		{
			b=700;
		}
		System.out.println("cot(single/Double)");
		cot=sc.next();
		if(cot.contentEquals("single")==true)
		{
			c=50;
			}
		else
		{
			c=100;
		}
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=sc.next();
		if(cable.equals("C")==true)
		{
			d=50;
		}
		else
			{
			d=0;
			
			}
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=sc.next();
		if(wifi.equals("W")==true)
		{
			e=150;
		}
		else
			{
			e=0;
			
			}
		System.out.println("Laundry service needed or not(L/nl)");
		laundry=sc.next();
		if(laundry.equals("L")==true)
		{
			f=300;
		}
		else
			{
			f=0;
			}
		total=b+c+d+e+f;
		System.out.println("the total charge is Rs."+total);
		System.out.println("the service chosen are ");
		if(b==1500)
		{
			System.out.println(" Ac ");
		}
		else
		{
			System.out.println(" non-Ac ");	
			
		}
		if(c==50)
		{
			System.out.println(" single cot ");
		}
		else
		{
			System.out.println(" double cot ");	
			
		}
		if(d!=50)
		{
			System.out.println("cable connection enabled  ");
		}
		else
		{
			System.out.println(" cable connection not enabled  ");
		}
		if(e!=0)
		{
			System.out.println("wifi enabled  ");
		}
		else
		{
			System.out.println(" wifi  not enabled  ");
		}
		if(f!=0)
		{
			System.out.println("with laundry service  ");
		}
		else
		{
			System.out.println(" without laundry service ");
		}
		System.out.println("Do you want to proceed");
		 pro=sc.next();
		if(pro.equals("yes")==true)
		{
			int[] booked = null;
			booked[i]=1;
			System.out.println("thank u your room is  "+i);
			i=i+1;
			
		}}while(pro.equals("no"));
		
		}

	}
