import java.util.Scanner;
public class Problem1{ 
  
  public static void main(String[]args){
  Scanner scan=new Scanner(System.in);
  System.out.println("please enter a number: ");
  int a=scan.nextInt();
  evenodd(a);
}
  public static void evenodd(int a){
  if(a%2==0){
  System.out.println("even");
}
  else
{ 
  System.out.println("odd");
}
}
}