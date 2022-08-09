import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
	public static void main(String args[]) {
		String eName;
		String eId;
		double eBalance;
		
		Scanner scan = new Scanner(System.in);
		
		BankAccount accounts[] = new BankAccount[10];
		
		int n,i=0,j;
		
		while(true) {
			System.out.println("Press 1 to Create an Account.");
			System.out.println("Press 2 to deposit money.");
			System.out.println("Press 3 to withdraw money.");
			System.out.println("Press 4 to display Account Information.");
			System.out.println("Press 0 to Exit.");
			n = scan.nextInt();
			if(n==0)
				break;
			else if(n==1) {
				System.out.println("Enter the Name of the Acccount Holder");
				eName = scan.next();
				System.out.println("Enter the ID of the Acccount Holder");
				eId = scan.next();
				System.out.println("Enter the initial Balance of the Acccount Holder");
				eBalance = scan.nextDouble();
				accounts[i] = new BankAccount(eName,eId,eBalance);
				i++;
			}
			else if(n==2) {
				System.out.println("Enter the account no. where want to deposit the money");
				j = scan.nextInt();
				System.out.println("Enter the amount you want to Deposit");
				double money = scan.nextDouble();
				accounts[j].deposit(money);
			}
			else if(n==3) {
				System.out.println("Enter the account no. from where want to withdraw the money");
				j = scan.nextInt();
				System.out.println("Enter the amount you want to Withdraw");
				double money = scan.nextDouble();
				accounts[j].withdraw(money);
			}
			else if(n==4) {
				
				for(j=0;j<accounts.length;j++)
				{
					if(accounts[j] != null)
						accounts[j].display();
				}
			}
				
		}
	}
}
