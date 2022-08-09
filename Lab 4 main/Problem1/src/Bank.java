import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the information: ");
		String name = scan.nextLine();
		String id= scan.nextLine();
		double balance=scan.nextDouble();
		
		BankAccount ba= new BankAccount(name,id,balance);
		ba.withdraw(2000);
		ba.display();
		System.out.println("ba.balance");
		ba.deposite(1000);
		ba.display();
		

	}

}
