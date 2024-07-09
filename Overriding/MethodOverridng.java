package Overriding;


class Bank
{
	public void RateOfIntrest()
	{
		System.out.println("Generally rate of intrest is 5%");
	}
}
class SBI extends Bank
{
	@Override
	public void RateOfIntrest()
	{
		System.out.println("rate of intrest is 6.5%");
	}
}
class Pnb extends Bank
{
	@Override
	public void RateOfIntrest()
	{
		System.out.println("rate of intrest is 7%");
	}
}
public class MethodOverridng {
	
	public static void main(String[] args)
	{
		SBI obj1 = new SBI();
		Pnb obj2 = new Pnb();
		Bank obj3 =  new Bank();
		obj1.RateOfIntrest();
		obj2.RateOfIntrest();
		obj3.RateOfIntrest();
		
	}

}
