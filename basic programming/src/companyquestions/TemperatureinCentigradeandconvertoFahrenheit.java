package companyquestions;

import java.util.Scanner;

public class TemperatureinCentigradeandconvertoFahrenheit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
        double f=(1.8*c)+32;
        System.out.println(f);
        

	}

}
