import java.io.Serializable;

public class CurrentAccount extends BankAccount implements Serializable {
	 String tradeLicenseNumber;

	public CurrentAccount (String memberName, double accountBalance , String tradeLicenseNumber) {

		
		super(memberName, accountBalance, 2000);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	
}