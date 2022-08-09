import java.io.Serializable;

public class SavingsAccount extends BankAccount implements Serializable {
	public double interest = 0.05 ;
    public double maxWithLimit;
    
    public SavingsAccount(String memberName, double accountBalance , double maxWithLimit) {
    	super(memberName, accountBalance, 2000);
    	this.maxWithLimit = maxWithLimit;
    	   
}
    
   @Override 
   public double getBalance() {
	   double total;
	   total = accountBalance + (interest * accountBalance);
	  return total;

   
   }
   @Override
   public void withdraw(double amount) {
	   
	   if(amount < maxWithLimit) {
		   super.withdraw(amount);
   }
   
   }
}

