import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TestServer {
	static ServerSocket ss=null;
	static Socket s=null;
	static InputStream is=null;
	static OutputStream os=null;
	static Scanner scan =null;
	static PrintWriter pw = null;

	public static void main(String[] args) {
		
		
		try {
			//1. At listening mode
			ss = new ServerSocket(4000);
			System.out.println("At listening mode.");
			
			//2. accept the request
			s=ss.accept();
			System.out.println("Request accepted.");
			os = s.getOutputStream();
			pw = new PrintWriter(os);
			
			// Thread for write
			Thread t1 = new Thread() {
				public void run() {
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
				}
			};
			t1.start();
			
			
			//3. generate Input or Output stream
			is = s.getInputStream();
			scan = new Scanner(is);
			while(scan.hasNextLine())
			{
				String data = scan.nextLine();
				System.out.println("Client:" + data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				is.close();
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			scan.close();
		}
		
		
		
		

	}

}
