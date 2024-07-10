package MultiThreading;


// cretaing thread using runnable interface

public class MyThread implements Runnable
{
	public void run()
	{
		//task for  thread
		for(int i=1; i<=10; i++)
		{
			System.out.println("value of i " +i);
			try{
				Thread.sleep(1000);  // it will show check exception to try and catch is used
			} catch (Exception e) {
				
			}
			}
	}
 
	public static void main(String args[])
	{
		// cretaing object of mythread class
		MyThread t1=new MyThread();
		
		Thread t2 = new Thread(t1);  // object of thread class
		
		t2.start();
		
		MyThread2 thread = new MyThread2();
		thread.start();
	}
}
