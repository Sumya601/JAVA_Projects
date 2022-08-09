import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestBank {
	static Scanner scan = new Scanner(System.in);
	static String fileName ="account.txt";
	

	public static void main(String[] args) {
		Bank bank = null;
		ObjectInputStream ois= null;
		try {
			ois=new ObjectInputStream(new FileInputStream(fileName));
			bank= (Bank)ois.readObject();
		}
		catch(IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			bank = new Bank();
		}
			finally {
				try {
					ois.close();
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		while(true) {
			int option = showMenu();
			switch(option) {
			case 1: 
				System.out.println("enter name, id , balance");
				bank.addAccount(scan.next(), scan.next(), scan.nextDouble());
				break;
			case 2:
				System.out.println("enter id , amount to deposit");
				bank.deposit(scan.next(), scan.nextDouble());
				break;
			case 3:
				System.out.println("enter id , amount to withdraw");
				bank.withdraw(scan.next(), scan.nextDouble());
				break;
			case 4:
				bank.display();
				break;
			case 0: 
				ObjectOutputStream oos=null;
				try {
					oos=new ObjectOutputStream(new FileOutputStream(fileName));
					oos.writeObject(bank);
					System.out.println("Updated");
				} catch (IOException e) {
					
				}
				finally {
					try {
						oos.close();
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}
				System.exit(0);
			}
		
		}

	}
	
	static int showMenu() {
		System.out.println("Enter 1 to create, 2 to deposit, 3 to withdraw, 4 to display, 0 to exit");
		return scan.nextInt();
	}

}
