import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		int n,k=1;
		int i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Value for the Pattern:");
		n = scan.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=2*i-1;j++) {
				System.out.printf("%d",j);
			}
			System.out.printf("\n");
		}
	}

}
