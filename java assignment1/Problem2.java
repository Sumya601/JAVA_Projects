import java.util.Scanner;
public class Problem2{
public static void main(String[]args){
   	int n;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number: ");
	n=scan.nextInt();
	int c=0;
	while(n!=1){
	if(n%2!=0)
	c++;
	n=n/2;
}
	if(c!=0)
	System.out.println("No");
	else
	System.out.println("Yes");

}

}