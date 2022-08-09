import java.io.Serializable;
public class BankAccount implements Serializable{
	String name,id;
	double balance;
	public BankAccount(String name, String id, double balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	public void withdraw(double amt) {
		if(amt<=balance)
			balance -= amt;
	}


	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", id=" + id + ", balance=" + balance + "]";
	}

	

}
