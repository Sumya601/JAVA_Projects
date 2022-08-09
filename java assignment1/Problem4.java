import java.util.Scanner;
public class Problem4{ 
  
   public static void main(String[]args){
   int a;
   System.out.println("please enter a number:");
   Scanner scan=new Scanner(System.in);
   a=scan.nextInt();
   calculate(a);
}
public static void calculate(int a){
   int i, c=0;
   for(i=2;i<a/2;i++)
{ 
   if(a%i==0){
   c=1;
   break;
}
}
  if(c==1){
 System.out.println("not prime"); 
  }
  else
  {
  System.out.println("prime");
}


}


}