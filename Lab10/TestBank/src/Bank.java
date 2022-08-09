import java.io.Serializable;
public class Bank implements Serializable{
	private BankAccount[] accounts = new BankAccount[10];
	//private int count=0;
	
	
	public void addAccount(String name, String id, double balance) {
		BankAccount ba = new BankAccount(name, id, balance);
		addAccount(ba);
	}


	private void addAccount(BankAccount ba) {
		int index = getLastIndex();
		if(index>=0)
			accounts[index] = ba;
		
		
	}
	
	public int getLastIndex() {
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null)
				return i;
		}
		
		return -1;
	}
	
	public void deposit(String id, double amt) {
		BankAccount ba = findAccount(id);
		if(ba != null)
			ba.deposit(amt);
	}
	
	public void withdraw(String id, double amt) {
		BankAccount ba = findAccount(id);
		if(ba != null)
			ba.withdraw(amt);
	}
	
	public BankAccount findAccount(String id) {
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null)
				return null;
			if(accounts[i].id.equals(id))
				return accounts[i];
		}
		
		return null;
	}


	public void display() {
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null)
				break;
			System.out.println(accounts[i]);
		}
	}
}
