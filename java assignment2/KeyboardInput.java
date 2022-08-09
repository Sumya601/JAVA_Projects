import java.util.Scanner;

public class KeyboardInput {
	public static void main(String[] args) {
		String a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Anything:");
		int x=1;
		while(!(a = scan.next()).equals("A"))
		{
			System.out.printf("Input %d: %s\n",x,a);
			x++;
		}
	}
}
