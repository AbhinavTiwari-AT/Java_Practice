// This Java program is to sum values of an array.

package Array_module_10;

class Array
{
	int Number[]= {6,7,8,9,1,2};
	
	public void m1()
	{
		int sum=0;
		for(int i=0;i<Number.length;i++	)
		{
		   sum=sum+Number[i];
		}
		 System.out.println("The Sum of array is : " + sum);
	}
    	
}
public class SumOfArray {
	
	public static void main(String[] args)
	{
		Array a=new Array();
		a.m1();
	}
}


/* The Sum of array is : 33
*/