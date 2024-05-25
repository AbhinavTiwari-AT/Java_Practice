package Arrays_Practice1;
import java.util.*;

public class Smallest_Value {
	
	public static int Getvalue(int number[])
	{
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<number.length;i++)
		{
			if(smallest > number[i])
			{
				smallest=number[i];
			}
		}
		return smallest;
	}
	
	public static void main(String[] args)
	{
		int number[]= {34,55,66,77,88,33,44};
		int Num= Getvalue(number);
		
		System.out.println("the smallest number is : " + Num);
	}

}
