package multithreading;

import java.util.Scanner;

public class welcome_sleep {

	public static void main(String[] args) {
		b a=new b();
		a.start();
	}

}
class b extends Thread{
	public void run() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.next();
		
		for(int i=0;i<st.length();i++)
		{
			char c=st.charAt(i);
			try {
				System.out.println(c);
				Thread.sleep(15000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
				
			}
		}
		
	}
}