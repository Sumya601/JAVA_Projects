import java.util.ArrayList;
import java.util.Scanner;
public class Bank {
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public void addAccount(String Name, String Id, double Bal) {
		
		accounts.add(new BankAccount(Name,Id,Bal));
		
	}
	
	public void deposit(String ID, double amt) {
		
		BankAccount acc1 = findAccount(ID);
		if(acc1==null)
			System.out.println("Account not Available");
		else
		acc1.deposit(amt);
	}
	
	public void withdraw(String ID, double amt) {
		
		BankAccount acc1 = findAccount(ID);
		if(acc1==null)
			System.out.println("Account not Available");
		else
		acc1.withdraw(amt);
	}
	
	public void display() {
		for(BankAccount acc: accounts) {
			acc.display();
		}
		
	}
	
	public BankAccount findAccount(String id) {
		for(int i=0;i<accounts.size();i++) {
			BankAccount acc = accounts.get(i);
			if(acc.id.equals(id)) {
				return acc;
			}
		}
		
		return null;
	}

}
