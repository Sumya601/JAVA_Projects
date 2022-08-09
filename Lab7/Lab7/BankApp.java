
import java.util.Random;
import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {
	
		Bank ba=new Bank();
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("Press 1 to add new account");
		System.out.println("Press 2 to deposite");
		System.out.println("Press 3 to withdraw"); 
		System.out.println("Press 4 to display");
		System.out.println("Press 0 to exit");
		int choice1=scan.nextInt();
		
		if(choice1==1)
		{
			System.out.println("Enter 1 :Savings Account");
			System.out.println("Enter 2 :Current Account");
			
			int choice2 = scan.nextInt();
			
			if(choice2 == 1) {
				System.out.println("Add Savings Account");
			
			String Name=scan.next();
			double Balance=scan.nextDouble();
			double Maxbal=scan.nextDouble();
			
			
			ba.addAccount(Name, Balance, Maxbal);
			
			}
			else if (choice2 == 2) {
				
				System.out.println("Add Current Account");
				String Name=scan.next();
				double Balance=scan.nextDouble();
				scan.nextLine();
				String tradeLicense = scan.next();
				
				ba.addAccount(Name, Balance,tradeLicense);
			
			}
		}
		
		else if(choice1 == 2)
		{
			System.out.println("Add account number and amount for deposite");
			
	
			String aNum = scan.next();
			double amt=scan.nextDouble();
			ba.deposite(aNum,amt);
			ba.display();
		}
		
		else if(choice1 == 3)
		{
			System.out.println("Add account number and amount for withdraw");
			

			String aNum = scan.next();
			double amt=scan.nextDouble();
			
			ba.withdraw(aNum,amt);
			ba.display();
		}
		else if(choice1 == 4)
		{
			ba.display();
		}
		else
			System.out.println("exit the program");
	}

}

	}


