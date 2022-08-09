import java.util.Scanner;
public class Problem5{
public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	calculate(a);
}
public static void calculate(int num)
{
	int temp=num,r=0,s=0,i=0;
	while(temp!=0)
    {
        temp=temp/10;
        s++;
    }
	int[]a=new int[s];
	while(num!=0)
    {
        r=num%10;
	num=num/10;
	a[i]=r;
	i++;
    }
       int j;
       for(j=(a.length)-1;j>=0;j--)
    {
       System.out.printf("%d,",a[j]);
    }
}
}