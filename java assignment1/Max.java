public class Max{

  public static void main(String[] args){

  int max=0,temp=0,sum=0,min=0;
  int a=6,b=7,c=15;
  float avg;
   
  if (a>b)
  temp=a;
  else temp=b;

  if (temp>c)
  max=temp;
  else
  max=c;
  System.out.printf("%d\n",max);

  sum= a+b+c;
 System.out.printf("%d\n",sum);
 if(a>b)
 temp=b;
 else temp=a;
 if(temp>c)
 min=c;
 else
 min=temp;
 System.out.println(min);

 avg=sum;
 System.out.printf("%f\n",avg/3);


 }

}