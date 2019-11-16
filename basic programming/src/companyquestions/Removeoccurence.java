package companyquestions;
import java.util.Scanner;

public class Removeoccurence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=a.replaceAll("the","*");
		System.out.println(b);

	}

}
