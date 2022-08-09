import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TestClient {

	static Scanner scan =null;
	static InputStream is = null;
	static Socket s=null;
	static OutputStream os=null;
	public static void main(String[] args) {
		
		
		
		try {
			//1. Send request
			System.out.println("Sending request.");
			//s=new Socket("localhost", 4000);
			s=new Socket("192.168.22.70", 4000);
			System.out.println("Connection established.");
			
			//2. generate Input or Output stream
			os = s.getOutputStream();
			
			// new Thread for read
			is = s.getInputStream();
			Thread t1 = new Thread() {
				public void run() {
					scan = new Scanner(is);
					while(scan.hasNextLine())
					{
						String data = scan.nextLine();
						System.out.println("Server:" + data);
					}
				}
			};
			t1.start();
			
			
			// write
			PrintWriter pw = new PrintWriter(os);
			Scanner scn1 = new Scanner(System.in);
			while(true) {
				String d = scn1.nextLine();
				pw.println(d);
				pw.flush();
				if(d.equals("exit")) {
					scn1.close();
					break;
				}				
			}
			
			
			
		} catch (IOException  e) {
			e.printStackTrace();
		}
		finally {
			try {
				os.close();
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		

	}

}
