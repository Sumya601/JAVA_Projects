

import java.util.Random;
import java.util.Scanner;
public class BankAccount {
	public String memberName, accountNumber;
	public double accountBalance,minimumBalance;
	
	public BankAccount(String mN, double acBal, double minBal) {
		this.memberName = mN;
		this.accountBalance = acBal;
		this.minimumBalance = minBal;
		Random rand = new Random();
		 accountNumber = 10000 + rand.nextInt(89999) + "";

}


	public void deposit(double amt) {
	
		accountBalance += amt;
	}
	
     public void withdraw(double amt) {
    	 if (accountBalance>amt) {
	if(accountBalance - amt>= minimumBalance ) {
		accountBalance-= amt;
	
				}
    	
    	 	}
 }
	public double getBalance()
	{
		return accountBalance;
	}
	public void display()
	{
		System.out.printf("memberName:%s ; accountNumber:%f ; accountBalance:%.2f ; minimumBalance:%.2f\n",memberName, accountNumber , accountBalance, minimumBalance);
	}
}

	
