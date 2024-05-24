package Arrays_Practice1;
import java.util.*;

public class LargestValue {
	
	public static int Getlargest(int array[])
	{
		int Largest= Integer.MIN_VALUE;   // this is known as - infity in java  and Integer.MAX_VALUE is + infinity
		for(int i=0;i<array.length;i++)
		{
		
			if(Largest < array[i])
			{
				Largest = array[i];
			}
		}
		return Largest;
	}
	
	public static void main(String[] args)
	{
		int array[]= {7,6,9,1,5,8};
		
		int L=Getlargest(array);
	
		System.out.println("the Largest no in array is : "+ L);
		
	}
	
	
}
