package p1;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.FileOutputStream;
public class test {
	public static void main(String[]args) throws Exception {
    Scanner s= new Scanner( new FileInputStream ("C:\\Users\\Lab4PC17\\Desktop\\olympic.txt"));
	
	//System.out.println(s.nextLine());
	//System.out.println(s.nextLine());
	//System.out.println(s.nextLine());
	//System.out.println(s.nextLine());
    PrintStream p= new PrintStream(new FileOutputStream("C:\\Users\\Lab4PC17\\Desktop\\processed.txt"));
		while(s.hasNext()) {
			//String st=s.nextLine();
			//String[] str=st.split(" ");
			//int total =Integer.parseInt(str[1])+Integer.parseInt(str[2])+Integer.parseInt(str[3]);
			
			
			//p.println(st +" Total:   "+ total);
			p.println(s.nextLine());

		
		}
	

}
}
