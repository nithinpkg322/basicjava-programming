package operators;
import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = a%10;
		int c = a/10;
		int d = b*c;
		int e = c*c;
		System.out.printf("%d %d",d,e);
		
		

	}

}
