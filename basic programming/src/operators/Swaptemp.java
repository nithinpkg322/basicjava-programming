package operators;
import java.util.Scanner;
public class Swaptemp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
