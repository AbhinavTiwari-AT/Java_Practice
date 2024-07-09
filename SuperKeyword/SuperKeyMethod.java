package SuperKeyword;

// the super keyword method is use to invoke parent class method

class A
{
	 void eat()
	{
		System.out.println("eating.....");
	}
}
class B extends A
{
 void eat()
	{
		System.out.println("not eating....");
	}
 void bark()
	{
		System.out.println("Barking");
	}
	void show()
	{
		super.eat();
		bark();
	}
   
}

public class SuperKeyMethod {
	
	public static void main(String[] args)
	{
		B obj= new B();
	    obj.show();
	
	}

}
