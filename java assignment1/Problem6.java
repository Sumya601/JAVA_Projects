import java.util.Scanner;
public class Problem6 {
public static void main(String[] args) 
	{       
                 System.out.println("please enter a number: ");
                 Scanner scan = new Scanner(System.in);
                 int n =scan.nextInt();
                 int a[]=new int [n];
		 for(int i=0;i<n;i++) 
           {
           a[i]=scan.nextInt(); 
           }
           calculate(a);
	} 
public static void calculate(int a[]) 
	{ 
		for (int i = a.length-1; i >= 0; i--) { 
		System.out.printf("%d",a[i]);
		} 
	} 
} 
