import java.util.Scanner;
public class ReachSquare {
	public static void main(String[] args) {
		System.out.println("Enter Two Nubers to Run the Programme:");
		int a,b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		passValue(a,b);
	}
	
	public static void passValue(int a, int b) {
		
		while(a != b)
		{
			if(a*a > b*b)
			{
				System.out.printf("%d ",a*a);
				a--;
			}
			else if(a*a < b*b)
			{
				System.out.printf("%d ",a*a);
				a++;
			}
		}
		if(a == b)
			System.out.println("Reached");
	}
}
