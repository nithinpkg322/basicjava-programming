package inheritance;

public class Toyota {
	void about()
	{
		System.out.println("WELCOME");
		System.out.println("sumo 2006 model");
	}
	
	

}
class Car1 extends Toyota{
	void speed(int a) {
	
	System.out.println("speed"+a);	
	
}
}