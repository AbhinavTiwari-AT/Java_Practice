package learn_Examples;

class BOX
{
	 int l,b,h;
	
	
	public BOX(int L,int B,int H)
	{
		l=L;
		b=B;
		h=H;
		
		m1();
	}
	public void m1()
	{
		System.out.println(l);
		System.out.println(b);
		System.out.println(h);
	}

}

public class Constructors {
	
	public static void main(String[] args)
	{
		BOX b1=new BOX(10,4,6);
		BOX b2=new BOX(8,6,7);
	 //b1.m1();
	 //b2.m1();
	}

}
