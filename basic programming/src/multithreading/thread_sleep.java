package multithreading;

public class thread_sleep {

	public static void main(String[] args) {
		c t=new c();
		t.start();
	}

}
class c extends Thread{
	public void run() {
		for(int i=1;i<5;i++)
		{
			try {
				System.out.println("Thread going to sleep "+i+" time");
				Thread.sleep(10000);
				}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Thread running "+i+" time");
			System.out.println(i);
			
		}
	}
}