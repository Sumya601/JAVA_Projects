import java.util.Scanner;
public class CGPA {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter student number: ");
		int n=input.nextInt();
		
		for(int i=1;i<=n;i++) {
			float a,hw,ct,mt,tf,tmarks=0;
			a=input.nextFloat();
			hw=input.nextFloat();
			ct=input.nextFloat();
			mt=input.nextFloat();
			tf=input.nextFloat();
			
			mt=mt/3;
			tf=tf/3;
			
			tmarks=a+hw+ct+mt+tf;
			if(tmarks>=80) {
				System.out.println("Student "+i+ " A+");
			}
			
			else if(tmarks>=75) {
				System.out.println("Student "+i+ " A");
			}
			
			else if(tmarks>=70) {
				System.out.println("Student "+i+ " A-");
				
			}
			else if(tmarks>=65) {
				System.out.println("Student "+i+ " B+");
			}
			else if(tmarks>=60) {
				System.out.println("Student "+i+ "B");
			}
			else if(tmarks>=55) {
				System.out.println("Student "+i+ " B-");
			}
			else if(tmarks>=50) {
				System.out. println("Student "+i+ " C+");
			}
			else if(tmarks>=45) {
				System.out.println("Student "+i+ " C");
			}
			else if(tmarks>=40) {
				System.out.println("Student "+i+ " D");
			}
			else {
				System.out.println("Student "+i+ " F");
			}
			
			
		}
			
	}


}
