import java.util.Scanner;
public class Problem9{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		int n;
		n=scan.nextInt();
		pattern(n);
}
	public static void pattern(int n){
	if(n>9)
	n=9;
	int i,j;
	for(i=1;i<=n;i++){
		for(j=1;j<=n-i;j++){
			System.out.printf(" ");
		}
		for(j=1;j<=i;j++){
			System.out.printf("%d",j);
		}
		for(j=i-1;j>=1;j--){
			System.out.printf("%d",j);
		}
			System.out.print("\n");
		}
	}
}
