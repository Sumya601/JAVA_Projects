import java.io.Serializable;

public class Bank implements Serializable {
	
BankAccount[]accounts=new BankAccount[10];
	
	public String addAccount(BankAccount acc)
	{
		for(int i=0;i<10;i++)
		{
			if(accounts[i] == null)
			{
				accounts[i]=acc; 
				System.out.println("new account is created");
				return acc.accountNumber;
			}
		}
		return null;
	}
	String addAccount(String n, double bal,  double maxWL) {
		
		BankAccount acc = new SavingsAccount(n,bal,maxWL);
		return addAccount (acc);
	}
	

	public String addAccount(String n, double bal,String tL) {
		BankAccount acc = new CurrentAccount(n, bal, tL);
	    return addAccount(acc);
		
	}
	
	public void deposite(String accountNumber,double amt)
	{
		BankAccount a=findAccount(accountNumber);
		if(a!=null) {
			a.deposit(amt);
			System.out.println("Balance after deposite:"+a.accountBalance);
			
		}
		else {
			System.out.println("Account is not found");
		}
	}
	
	public void withdraw(String accountNumber,double amt)
	{
		BankAccount b=findAccount(accountNumber);
			if(b!=null) {
				b.withdraw(amt);
				System.out.println("Balance after withdraw:"+b.accountBalance);
			}
			
			else {
			System.out.println("Account is not found"); 
			}	
	}
	
	public BankAccount findAccount(String accountNumber)
	{
		boolean found = false;
		for(int i=0;i<10;i++)
		{
			if(accounts[i]!=null)
			
				if(accounts[i].accountNumber.equals(accountNumber))
				
					found = true;
				
					return accounts[i];
		}
			
				return null;
	
	}
	public void display()
	{
		for(int i=0;i<10;i++)
		{
			if(accounts[i]!=null)
			
				accounts[i].display();
				else 
					break;
				
			}
		}
	}
	


