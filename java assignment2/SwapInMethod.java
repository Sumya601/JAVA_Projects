import java.util.Scanner;

public class SwapInMethod {
	public static void main(String[] args) {
		System.out.println("Enter Two Nubers to Swap in Method:");
		int a1,b1;
		Scanner scan = new Scanner(System.in);
		a1 = scan.nextInt();
		b1 = scan.nextInt();
		
		passValue(a1,b1);
		
		System.out.printf("Value in Main: %d %d\n",a1,b1);
	}
	
	public static void passValue(int a,int b) {
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("Value in Method: %d %d\n",a,b);
	}
}
