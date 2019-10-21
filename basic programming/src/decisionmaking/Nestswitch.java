package decisionmaking;

import java.util.Scanner;

public class Nestswitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1)veg\n2)non-veg\n");
		int n=s.nextInt();
//		System.out.println("food type");
	    char f =s.next().charAt(0);
	    switch(n){
	    	case 1:
	    		System.out.println("veg");
	    		System.out.println("food type");
	    		
	    		switch(f) 
	    		{
	    		case 'a':
	    			System.out.println("meals");
	    			break;
	    		case 'b':
	    			System.out.println("fried rice");
	    			break;
	    		case 'c':
	    			System.out.println("dosa");
	    			break;
	    			default:
	    				System.out.println("invalid input");
	    		}
	    		break;
	    	case 2:
	    		System.out.println("non-veg");
	    		
	    		switch(f) {
	    		case 'a':
	    			System.out.println("chicken biriyani");
	    			break;
	    		case 'b':
	    			System.out.println("poratta and beaf");
	    			break;
	    		case 'c':
	    			System.out.println("shavarma");
	    			break;
	    			default:
	    				System.out.println("invalid input");
	    		}
	    		break;
	    }

	}

}
