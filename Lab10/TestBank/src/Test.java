import java.io.*;
public class Test {
	public static void main(String[] args) {
		try {
			BankAccount ba1=new BankAccount("abc","18c",1100);
			FileOutputStream fout= new FileOutputStream("f.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);
			
			out.writeObject(ba1);
			out.flush();
			System.out.println("success");
			out.close();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
