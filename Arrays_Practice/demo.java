package Arrays_Practice1;

public class demo {
	public static int main(String[] args)
	{
		int numbers[]= {10,77,60,70,58,66,55,33,20,25};
		int key=58;
		
	   
		
			for(int i=0;i<numbers.length;i++)
			{
				if(numbers[i]==key)
				{
					return i;
				}
			}
		    return -1;
		}
	    
	 if(index==-1)
	 {
		 System.out.println("not found");
	 }
	 else 
		 System.out.println(index);

	
}

}
