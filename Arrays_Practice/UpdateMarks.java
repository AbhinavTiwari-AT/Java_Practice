// updating marks by using call by reference

package Arrays_Practice1;

public class UpdateMarks {
	
	public static void update(int marks[])
	{
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=marks[i]+1;
		}
	}
	
	public static void main(String args[])
	{
		int marks[]= {94,78,99};
		
		update(marks);  // calling value
		
		
		// to print marks
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
	}

}
