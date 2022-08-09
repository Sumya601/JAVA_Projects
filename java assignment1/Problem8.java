import java.util.Scanner;

public class Problem8{
	public static void main(String[] args){

	int [] n=new int[5];
	int j ,sum=0;

	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the numbers: ");

	for(j=0;j<5;j++)
		{

		n[j]=scan.nextInt(); 

		}
	int index=0;
	int max=n[0];
 

		for(j=0;j<5;j++)
		{
			if(n[j]>max)
			{
				max=n[j];
				index=j;
			}

		}

System.out.println(max);
System.out.println(index);
index=0;

	
	
	int min=n[0];
 

		for(j=0;j<5;j++)
		{
			if(n[j]<min)
			{
				min=n[j];
				index=j;
			}

		}

System.out.println(min);
System.out.println(index);

}
}