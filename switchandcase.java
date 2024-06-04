package conditionstatement;
import java.util.Scanner;

public class switchandcase {

 public static void main(String[] args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the world cup year");
	 int year=sc.nextInt();
	 
	switch(year)
	{
	case 1975: 
		System.out.println("winner is west indies");
		break;
	case 1979:
		System.out.println("winner is west indies");
		break;
	case 1983:
		System.out.println("winner is india");
		break;
	case 1987:
		System.out.println("winner is Australia");
		break;
	case 1992:
		System.out.println("winner is pakistan");
		break;
	case 1996:
		System.out.println("winner is shrilanka");
		break;
	case 1999:
		System.out.println("winner is Austrailia");
		break;
	case 2003:
		System.out.println("winner is Austrailia");
		break;
	case 2007:
	System.out.println("winner is Austrailia");
	break;
	case 2011:
		System.out.println("winner is India");
		break;
	case 2015:
		System.out.println("winner is Australia");
		break;
	case 2019:
		System.out.println("winner is england");
		break;
	default:
		System.out.println("input is wrong");

 }

}
}
