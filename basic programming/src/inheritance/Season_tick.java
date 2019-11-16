package inheritance;

import java.util.Scanner;

public class Season_tick extends Bokking {
		Scanner s=new Scanner(System.in);
		int person;
		int days;
		int tariff;
		
		void person(int psn)
		{
			this.person=psn;
			
		}
		void Days(int dys)
		{
			this.days=dys;
			
		}
		void gettariff(int c)
		{
			this.tariff=c;
		}
		int setperson()
		{
			return this.person;
		}
		
			int setdays()
			{
				return this.days;
				
			}
		
			int settariff()
			{
				return this.tariff;
			}
		}
         



