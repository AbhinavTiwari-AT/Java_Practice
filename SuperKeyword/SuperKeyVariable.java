package SuperKeyword;

//the super keyword variable is used to invoke Parent class Variable

class Animal
{
	String color="White";

}

class Dog extends Animal
{
	String color = "Black";
	 
	public void printColor()
	{
		System.out.println(color);         // this will print Dog class Color
		System.out.println(super.color); // prints parent Class Color
	}
}

public class SuperKeyVariable {
	
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.printColor();
	}

}
