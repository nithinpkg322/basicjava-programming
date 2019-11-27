
package inheritance;

import java.util.Scanner;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
Car1 t=new Car1();
System.out.println("Enter the speed");
int b=s.nextInt();
t.about();
t.speed(b);
	}

}
