import java.util.Scanner;

public class AccountDetails {

	 
		public static Account getAccountDetails() 
		{
		Account acc=new Account();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the accountid");
		acc.setAccountid(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter the accounttype");
		acc.setAccounttype(scanner.nextLine());
		int b;
		do
		{
			System.out.println("Enter the balance");
			acc.setBalance(Integer.parseInt(scanner.nextLine()));
			b=acc.getBalance();
			if(b<=0) 
				System.out.println("Balance should be positive");
		}
			while(b<=0);
			return acc;
		

	}
		
		
	
	  public static int getWithdrawalAmount()
	  {
		Scanner sc=new Scanner(System.in);
		int w;
		do
		{
			System.out.println("Enter amount to be withdrawn");
			
			w=sc.nextInt();
			
			if(w<=0)
				System.out.println("Amount should be positive");
		}
		while(w<=0);
		return w;
			}

	  public static void main(String[] args) 
	  {
		  Account accObj=new Account();
		  accObj=getAccountDetails();
		  int c = getWithdrawalAmount();
		  accObj.withdraw(c);
		  
		  
		  
	  }
	  
}

	