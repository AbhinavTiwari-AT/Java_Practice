package conditionstatement;
import java.util.Scanner;

public class ifelse {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of candidte");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("the candidate is eligble for voting");
		}
		else {
			System.out.println("the candidate is not eligible for voting");
		}
	}

}
