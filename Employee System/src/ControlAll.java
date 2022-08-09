import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.DefaultListModel;

public class ControlAll {
	static UapCSE uc=null;
	static HomePage frame = new HomePage();
	static Main frame1 = new Main();
	static AddEmployee frame2 = new AddEmployee();
	static Salaried frame3 = new Salaried();
	static Hourly frame4 = new Hourly();
	static Commission frame5 = new Commission();
	static GetInformation frame6 = new GetInformation();
	static IncreaseSalary frame7 = new IncreaseSalary();
	static Display frame8 = new Display();
	
	static DefaultListModel<String>employee=new DefaultListModel<String>();
	static String fileName="Employee Details.txt";
	
	public static void main(String[]args) {
		frame.setVisible(true);
		
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream(fileName));
			uc=(UapCSE)ois.readObject();
		}
		catch(IOException | ClassNotFoundException e ) {
			uc=new UapCSE();
			System.out.println("No Data....");
		}
		finally {
			try {
				ois.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
