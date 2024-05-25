// this program is to reverse the array 

package Arrays_Practice1;

class Array{
	 int number[] = {7,8,5,6,4,8,4,10};
	    public void reverse()
	    {	
		   int first=0 ;  int last= number.length-1;
		   while(first<last)
		   {
			   //To Swap numbers of array
			   
			   int temp= number[last];
			   number[last]=number[first];
			   number[first]=temp;
			   
			   first ++;
			   last --;
		   }
		   
		   show();
	    }
	    // to print no of arrays
	    
	    public void show()
	    {
	    	for(int i = 0;i < number.length;i++)
	    	{
	    		System.out.print(+ number[i] +" ");
	    	}
	          System.out.println();
} }


public class ReverseArray {

	public static void main(String[] args)
	{
		
		Array A= new Array();
		A.reverse();
		
	}
}
