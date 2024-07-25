package Encapsulation;

import java.util.Scanner;

class SquareAndCube
{ 

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	
	int  b,c;
	public void sq()
	{
	 b= a*a;
	 
	 System.out.println("The Square of number is :- "+b);
	}
	
	public void cube()
	{
		c= a*a*a;
		
		System.out.println("The cube of nubmer is :- "+c);

		
	}
	
	
	
}

public class SqAndCube {
	
	
	public static void main(String[] args)
	{
		SquareAndCube sqa = new SquareAndCube();
		
		
		sqa.sq();
		sqa.cube();
	}

}
