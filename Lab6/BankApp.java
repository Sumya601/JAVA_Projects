import java.util.Scanner;

public class BankApp {
	public static void main(String args[]) {
		String bName;
		String bId;
		double bBalance;
		
		Scanner scan = new Scanner(System.in);
		Bank OneAccount = new Bank();
		
		int n;
		
		while(true) {
			System.out.println("Press 1 to add new Account");
			System.out.println("Press 2 to Deposit in an existing Account");
			System.out.println("Press 3 to Withdraw from an Account");
			System.out.println("Press 4 Display the List of the Accounts");
			System.out.println("Press 0 to Exit");
			n = scan.nextInt();
			
			if(n==0)
				break;
			else if(n==1) {
				System.out.println("Enter the Name of the Account holder");
				bName = scan.next();
				System.out.println("Enter the ID of the Account");
				bId = scan.next();
				System.out.println("Enter the Initial balance of the Account");
				bBalance = scan.nextDouble();
				
				OneAccount.addAccount(bName,bId,bBalance);
			}
			else if(n==2) {
				System.out.println("Enter the Account no.(ID) where you want to deposit");
				bId = scan.next();
				System.out.println("Enter the Amount you want to deposit");
				bBalance = scan.nextDouble();
				
				OneAccount.deposit(bId,bBalance);
			}
			else if(n==3) {
				System.out.println("Enter the Account no.(ID) from where you want to deposit");
				bId = scan.next();
				System.out.println("Enter the Amount you want to withdraw");
				bBalance = scan.nextDouble();
				
				OneAccount.withdraw(bId,bBalance);
			}
			else if(n==4) {
				OneAccount.display();
			}
			
		}
	}

}
