package multithreading;

public class car_run {

	public static void main(String[] args) {
		car t=new car();
		car1 t1=new car1();
		car3 t2=new car3();
		t.start();
		t1.start();
		t2.start();
		
		
		
	}

}
class car extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==1)yield();
			{
					System.out.println("car A running "+i);
					}
			System.out.println("car A running complete");
			
			}
		}
}
	class car1 extends Thread{
		public void run() {
			int i;
			for(i=0;i<=5;i++)
			{
				if(i==2)stop();
				{
					System.out.println("car B running "+i);
				}
		System.out.println("car B running complete");
		
		}
				}
	}
		class car3 extends Thread{
			public void run() {
				for(int i=0;i<=5;i++)
				{
					if(i==3)
					{
						try {
							System.out.println("car running sleep");
							Thread.sleep(10000);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}}
	}
