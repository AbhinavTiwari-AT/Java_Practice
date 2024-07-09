package learn_Examples;

class Student
{
	int id;
	String name;

	public Student(int id , String name)
	{
		this.id=id;
		this.name=name;
		
	System.out.println(" the id is " +this.id +" the name is " + this.name) ;
	
System.out.println("parametrized");
	}
	
	Student()
	{
		System.out.println("Default constructor");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Student st=new Student(4,"Abhinav");

	}

}
