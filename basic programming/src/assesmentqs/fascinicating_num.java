package assesmentqs;

import java.util.Scanner;

public class fascinicating_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num * 2;
        int num2 = num * 3;
        String str = num +""+ num1 + num2;
        boolean x = true;
        for(char i = '1'; i <= '9'; i++)
        {
            int y = 0;
            for(int j = 0; j < str.length(); j++)
            {
                char c = str.charAt(j);
                if(c == i)
                    y++;
            }
            if(y > 1 || y == 0)
            {
                x = false;
                break;
            }
        }
        System.out.println(num);
        if(x)
            System.out.println("Fascinating number");
        else
            System.out.println("Not a fascinating number" );
	}

}
