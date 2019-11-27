package Set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class casestudy_1 {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Newcard> s=new TreeSet<Newcard>(new Symbol());
		Newcard[] c=new Newcard[40];
		int n=sc.nextInt();
		int count=0;
		int num;
		while(s.size()<n)
		{
			String symbol=sc.next();
			num=sc.nextInt();
			c[count]=new Newcard();
			c[count].setSymbol(symbol);
			c[count].setNum(num);
			s.add(c[count]);
			count++;
			}
		System.out.println(n+"symbols gathered in "+count+"cards");
		System.out.println("cards are");
		Iterator<Newcard> itr=s.iterator();
		while(itr.hasNext())
		{
			Newcard ca=(Newcard)itr.next();
			System.out.println(ca.getSymbol()+""+ca.getNum());
	}


	}

}
