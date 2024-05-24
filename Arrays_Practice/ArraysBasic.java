//this is basic program to marks and print by using array

package Arrays_Practice1;
import java.util.Scanner;

class Marks{
	
	int marks[]=new int[100];
    
	public void m1()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("the lengthg of array is : " + marks.length);  // to calculcate length of array
	
	System.out.println("enter the marks of 3 subjects");
    marks[0]=sc.nextInt();	
	marks[1]=sc.nextInt();	
	marks[2]=sc.nextInt();	
	
	
//	marks[2]=100; // this is to update marks by dowing this we can only print 100 in marks[2]
//   marks[0]=marks[0]+1           // this also to update marks it will print by adding 1 in actual marks
 	show();
 	percentage();
  }
	
	public void show()
	{
		
		System.out.println("The Marks of Physic is :" + marks[0]); 
		System.out.println("The Marks of chemistry is :" + marks[1]); 
		System.out.println("The Marks of maths is :" + marks[2]); 
	}
	public void percentage()
	{
		int perct= (marks[0]+marks[1]+marks[2])/3;
		System.out.println("The percentage of 3 subjects is : " + perct+"%");
	}
}
public class ArraysBasic
{
	public static void main(String[] args)
	{
		Marks m=new Marks();
		m.m1();
		
	}

}