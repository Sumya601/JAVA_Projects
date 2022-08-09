import java.util.Scanner;
public class MaxInMatrix {
	public static void main(String[] args) {
		int n,m,i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Declare the Size of the 2D Matrix:");
		n = scan.nextInt();
		m = scan.nextInt();
		int a [][] = new int [n][m];
		
		System.out.println("Enter the Values of the 2D Matrix:");
		
		int Max = a[0][0];
		int indexi=0,indexj=0;
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
					a[i][j]=scan.nextInt();
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(a[i][j]>Max)
				{
					Max=a[i][j];
					indexi=i;
					indexj=j;
				}
					
			}
		}
		
		System.out.printf("Max:%d\nLocation:[%d][%d]",Max,indexi,indexj);
	}

}
