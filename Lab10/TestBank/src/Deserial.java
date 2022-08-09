import java.io.*;
public class Deserial {

	public static void main(String[] args) {
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
			BankAccount ba=(BankAccount)in.readObject();
			System.out.println(ba);
			in.close();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
