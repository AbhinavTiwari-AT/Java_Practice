//this is java basic project on ATM Machine by using java Classes and Object 

package ATMMachine;
import java.util.*;


class ATM{
	float Balance;
	int PIN = 5546;
	
	public void  checkpin()                // this method is check the pin 
	{
		System.out.println("Enter the pin :-");
		Scanner sc=new Scanner(System.in);
	  	int enetredpin = sc.nextInt();
	    if(enetredpin==PIN) 
	    {
	    	menu();
	    }
	    else
	    {
	    	System.out.println("Enetr a valid pin");
	    
	    }
	}
	public void menu()
	{
		System.out.println("Enetr your Choice :-");
		System.out.println("1. Check Balance");
    	System.out.println("2. Withdraw Money");
    	System.out.println("3. Deposit Money");
    	System.out.println("4. Exit");
    	
    	Scanner sc = new Scanner(System.in);
    	int option=sc.nextInt();
    	
    	if(option == 1)
    	{
    		CheckBalance();
    	}
    	else if(option==2) 
    	{
    		WithdrawMoney();
    	}
    	else if(option == 3)
    	{
    		DepositeMoney();
    	}
    	else  if(option==4)
    	{
    		return;
    	}
    	else
    	{
    		System.out.println("Enter a valid choice");
    	}
    }
	
	public void CheckBalance() {
		System.out.println("Balance :-"+ Balance);
		menu();
	}
	public void WithdrawMoney() {
		System.out.println("Enetr Amount to withdraw");
		Scanner sc=new Scanner(System.in);
	    float amount = sc.nextFloat();	
	    if(amount>Balance) {
	    	System.out.println("Insufficient Balance");
	    }
	    else 
	    {
	    	Balance= Balance-amount;
	    	System.out.println("Money Withdrawl Successfull");
	    }
	    menu();
	    
	}
	
	public void DepositeMoney()
	{
		System.out.println("Enter the amount :-");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		Balance=Balance+amount;
		System.out.println("Money deposite Successfully");
		
		menu();
	}

		
}
public class ATMMachine {
	
	public static void main(String[] args) {
		
		ATM obj=new ATM();
		
		obj.checkpin();	
	}
}


/* 
   OUTPUT :- 
 
Enter the pin :-
5546
Enetr your Choice :-
1. Check Balance
2. Withdraw Money
3. Deposit Money
4. Exit
1
Balance :-0.0
Enetr your Choice :-
1. Check Balance
2. Withdraw Money
3. Deposit Money
4. Exit
3
Enter the amount :-
50000
Money deposite Successfully
Enetr your Choice :-
1. Check Balance
2. Withdraw Money
3. Deposit Money
4. Exit
2
Enetr Amount to withdraw
20000
Money Withdrawl Successfull
Enetr your Choice :-
1. Check Balance
2. Withdraw Money
3. Deposit Money
4. Exit
1
Balance :-30000.0
Enetr your Choice :-
1. Check Balance
2. Withdraw Money
3. Deposit Money
4. Exit
4

 */

