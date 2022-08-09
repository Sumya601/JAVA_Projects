import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JPanel;
import java.util.*;
public class Main {
	static HomePage homeframe = new HomePage();
	static Bank ba=new Bank();

	static String filename = "account.txt";
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		homeframe.setVisible(true);
		
		ObjectInputStream ois =null;
		try {
		ois = new ObjectInputStream(new FileInputStream(filename));
		ba = (Bank)ois.readObject();
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			ba = new  Bank();
		}
		finally {
	
			try {
				ois.close();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}

}
