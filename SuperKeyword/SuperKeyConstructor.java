package SuperKeyword;
// to invoke parent class constructor

class E
{
	E()
	{
		System.out.println("animal is created");
	}
}
class D extends E
{
	D()
	{
		super();
		System.out.println("dog is created");
		
	}
}

public class SuperKeyConstructor {
	
	public static void main(String[] args)
	{
		D obj = new D();
	}
	
	

}
