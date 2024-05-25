// this program to make pairs in array

package Arrays_Practice1;
class Pairs
{
	
	int number[] = {2,6,7,8,5,9,4};
	
	public void m1()
	{
		int i,j,tp=0;
		for(i=0;i < number.length; i++)
		{
			int num = number[i];
			
			for(j=i+1 ; j < number.length; j++ )
			{
				System.out.print("("+num + number[j] + ")");
				tp++;
			}
			System.out.println();		
		}
		System.out.println("total no of pairs are : " +tp);
	}
		
	}

public class PairsInArray {

	public static void main(String[] args) {
     Pairs A=new Pairs();
	  A.m1();

	}
}


/* Output of Program is :-

(26)(27)(28)(25)(29)(24)
(67)(68)(65)(69)(64)
(78)(75)(79)(74)
(85)(89)(84)
(59)(54)
(94)

total no of pairs are : 21
*/