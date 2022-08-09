import java.util.Scanner;
public class Problem3{ 
  
  public static void main(String[]args){
  Scanner scan=new Scanner(System.in);
  System.out.println("please enter a number: ");
  int num=scan.nextInt();
  Fibonacci(num);
}
  public static void Fibonacci(int num){
  int a=0,b=1,c=0,count=0;
while(count<num)
{
 a=b;
 b=c;
 c=a+b;
 System.out.printf("%d\n",c);
 count++;
}
  
}

}