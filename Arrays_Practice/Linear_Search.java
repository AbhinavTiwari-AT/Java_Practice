// this program is for search number in array
package Arrays_Practice1;


public class Linear_Search {

		public static int linearSearch(int number[],int key)
		{
			for(int i=0;i<number.length;i++)
			{
				if(number[i]==key)
				{
					return i;
				}
			}
		    return -1;
		}
	public static void main(String[] args)
	{
		int numbers[]= {10,77,60,70,58,66,55,33,20,25};
		int key=58;
		
	   int index= linearSearch(numbers,key);
	    
	 if(index==-1)
	 {
		 System.out.println("not found");
	 }
	 else 
		 System.out.println(index);

	
}}
