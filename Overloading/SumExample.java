package Overloading;

class SumDemo
{
	public void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
		
	}
	public void sum(int a ,int b)
	{
		System.out.println(a+b);
	}
	public void sum(String a,String b)
	{
		System.out.println(a+b);
	}
}

public class SumExample {
	
	public static void main(String[] args)
	{
            SumDemo s= new SumDemo();
            s.sum(5, 8, 7);
            s.sum(5, 6);
            s.sum("Abhinav","Tiwari");
            		
	}

}
