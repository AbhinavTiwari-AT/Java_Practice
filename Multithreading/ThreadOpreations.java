package MultiThreading;


class User extends Thread
{
	public void run()
	{
		System.out.println("This is thread by user");
	}
}


public class ThreadOpreations {

	public static void main(String[] args)
	{
		System.out.println("program Started....");
		
		int x = 56+34;
		System.out.println("sum is: " +x);
		
		// thread ...
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("current runnning thread is " +tname);
	    
		//setName
		t.setName("Abhinav");
		System.out.println(t.getName());	
		
		//Sleep..
		try {
		Thread.sleep(3000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		//thread Id...
		
		
	System.err.println(t.getId());
		
		
		
		System.out.println("program Stopped");
		
		User t1 = new User();
		
		t1.start();
		
	}
}
