
import java.util.Scanner;

public class UAP {

	public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	     
	     UapCSE emp=new UapCSE();
	     int n=0;
	     do {
	    	 
	    	
	    	 System.out.println("Enter 1 :Add a new Employee");
	    	 System.out.println("Enter 2 :Salary information of a specific Employee ");
	    	 System.out.println("Enter 3 :Increase the salary of an Employee");
	    	 System.out.println("Enter 4 :Display the list of the Employees");
	    	 System.out.println("Enter 0 :exit");
	    	 
	    	 System.out.println("enter your choice :");
	    	 n=scan.nextInt();
	    	 
	    	 switch(n)
	    	 {
	    	   case 1:
	    	   {
	    		   int choice=0;
	    		   do {
	    			   System.out.println();
	    			   System.out.println("Enter 1:Salaried Employee");
	    			   System.out.println("Enter 2:Hourly Employee");
	    			   System.out.println("Enter 3:Commission Employee");
	    			   System.out.println("Enter 0:Exit");
	    			   
	    			   System.out.println("Enter your choice :");
	    			   choice=scan.nextInt();
	    			   
	    			   if(choice==1)
	    			   {
	    				   scan.nextLine();
	    				   System.out.println("Enter Employee Name:");
	    				   String name = scan.nextLine();
	    				   System.out.println("Enter Employee ID:");
	    				   String i = scan.nextLine();
	    				   System.out.println("Enter Employee Designation:");
	    				   String d = scan.nextLine();
	    				   System.out.println("Enter Employee Monthly Salary:");
	    				   double ms= scan.nextDouble();
	    				   emp.addNewEmployee(name, i, d, ms);
	    				   
	    			   }
	    			   
	    			   else if(choice==2)
	    			   {
	    				   System.out.println("Enter Employee Name:");
	    				   String name = scan.next();
	    				   System.out.println("Enter Employee ID:");
	    				   String i = scan.next();
	    				   System.out.println("Enter Employee Designation:");
	    				   String d = scan.next();
	    				   System.out.println("Enter Employee Hourly Rate:");
	    				   double hr= scan.nextDouble();
	    				   System.out.println("Enter Employee Hourly Work:");
	    				   int hw = scan.nextInt();
	    				   emp.addNewEmployee(name, i, d, hr, hw);
	    				   
	    			   }
	    			   else if(choice==3)
	    			   {
	    				   scan.nextLine();
	    				   System.out.println("Enter Employee Name:");
	    				   String name = scan.nextLine();
	    				   System.out.println("Enter Employee ID:");
	    				   String i = scan.nextLine();
	    				   System.out.println("Enter Employee Designation:");
	    				   String d = scan.nextLine();
	    				   System.out.println("Enter Employee Commission:");
	    				   double c= scan.nextDouble();
	    				   System.out.println("Enter Employee Sale:");
	    				   double s= scan.nextDouble();
	    				   
	    				   emp.addNewEmployee(name, i, d, c, s);
	    			   }
	    			   
	    			  
	    			   
	    		   }while(choice!=0);
	    		   
	    		   break;   
	    		   
	    		   
	    	   }
	    	   case 2:{
	    		     System.out.println("Enter id to get employees Salary :");
	            	 String id=scan.next();
	            	 System.out.println(emp.getSalary(id));
	    		     break;
	    	   }
	    	 
	    	   case 3:{
	    		   System.out.println("Enter emloyees id for incresing Amount :");
	               String ID=scan.next();
	               double amnt=scan.nextDouble();
	               emp.increaseSalary(ID, amnt);
	    		   
	               break; 
	    	   }
	    	   
	    	   case 4:{
	    		   emp.display();
	    		   break;
	    	   }
	    	   
	    	   default :{
	    		   System.out.println("Try again");
	    	   }
	    	 }
	    	 
	    	 
	    	 
	     }while(n!=0);
	     

	}

}
