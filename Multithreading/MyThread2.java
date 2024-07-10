package MultiThreading;

// creating thread using thread class

public class MyThread2 extends Thread {

	public void run()
	{
		for(int i=10; i>=1; i--)
		{
			System.out.println("print i : " + i);
		}
		
		try {
			
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/*
	public static void main(String[] args)
	{
		MyThread2 thread = new MyThread2();
		thread.start();
	}
	*/
	
}
