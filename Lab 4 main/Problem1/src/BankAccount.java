
public class BankAccount {
	//Instance variables
	public String name;
	public String id;
	public double balance;

	// Constructor with parameter
	public BankAccount(String name, String id, double balance) {
		this.name=name;
		this.id=id;
		this.balance=balance;

	}
	//method
	public void deposite(double depammount) {
		balance=balance+depammount;
	}
	public void withdraw(double withammount) {
		if(withammount<balance) {
			balance=withammount;
		}
	}
	public double getbalance() {
		return balance;
	}
	public void display() {
		System.out.printf("name:%s,id:%s,balance:%.1f\n",name,id,balance);
	}

}

