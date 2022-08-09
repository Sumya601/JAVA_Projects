import java.util.Scanner;
public class Problem7{

	public static void main(String[] args){

	System.out.println("please enter a number: ");
                 Scanner scan = new Scanner(System.in);
                 int n =scan.nextInt();
                 int a[]=new int [n];
		 for(int i=0;i<n;i++) 
           {
           a[i]=scan.nextInt(); 
           }
	evensum(a);
}



public static void evensum(int[] x)

{
 	int i,sum=0;
		for(i=0;i<x.length;i++)
		{
			if(x[i]%2 == 0)
			sum=sum+x[i];
		}
	
	System.out.println(sum);

	


}

}
