package MultiThreading;

// producer comsumer problem

class Company
{
	int n;
	boolean f = false;
	//f= false : chance : producer
	//f= true:chance :consumer
 synchronized	public void produce_item(int n)  throws Exception
	{
	 if(f)
	 {
		wait();
	 }
		this.n=n;
		System.out.println("produced :" +this.n);
		f=true;
		notify();
	}
	synchronized  int consume_item() throws Exception
	{
		if(!f)
		{
		wait();
		}
		System.out.println("consumed : " +this.n);
		return this.n;
	}
}

class Producer extends Thread
{
	Company c;
	
	Producer(Company c)
	{
		this.c = c ;
	}
	public void run()
	{
		int i=1;
		while(true)
		{
			try {
				this.c.produce_item(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
			Thread.sleep(1000);
		}catch (Exception e) {}
			i++;
			
			}
	}
}

class Consumer extends Thread
{
	Company c;
	public Consumer(Company c) {
		this.c=c;
		
	}
	
	public void run() {
	
		while(true)
		{
			try {
				this.c.consume_item();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			}catch(Exception e)
			{
				//
			}
			
		}
	}
}

public class Syncronization {
	
public static void main(String[] args)
{
	Company com = new Company();
	Producer p =new Producer(com);
	Consumer c = new Consumer(com);
	p.start();
	c.start();
		
}

}
