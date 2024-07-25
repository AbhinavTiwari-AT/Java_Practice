package Encapsulation;

class Student
{
	private String name;
	private int age;
	private int rollno;


public String getname()
{
	return name;
}

public int getage()
{
	return age;
}
public int getrollno()
{
	return rollno;
}


public void setname(String name)
{
	this.name=name;
}

public void setage(int age)
{
	this.age=age;
}
public void setrollno(int rollno)
{
	this.rollno=rollno;
}


}

public class GetterAndSetter {
	
public static void main(String[] args)
{
	Student s = new Student();
	s.setage(22);
	s.setname("abhinav");
	s.setrollno(1);
	
	System.err.println(s.getname());
	System.err.println(s.getage());
	System.err.println(s.getrollno());
  
}

}
