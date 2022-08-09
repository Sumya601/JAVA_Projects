import java.io.Serializable;

public class UapCSE implements Serializable{

	       Employee[] employees=new Employee[10];
	       
	       public void addNewEmployee(Employee e)
	       {
	    	   int i;
	    	   for(i=0;i<employees.length;i++)
	    	   {
	    		   if(employees[i]==null)
	    		   {
	    			   employees[i]= e;
	    			   break;
	    		   }
	    		  
	    	   }
	    	    if(i==employees.length )
			   {
				   System.out.println("Not enough rank");
			   }
	       }
	       
	       void addNewEmployee(String n, String I, String d, double s) {
	    	   Employee e=new SalariedEmployee(n,I,d,s);
	    	   addNewEmployee(e);  	   
	    	   
	       }
	       
	       public void addNewEmployee(String n, String I, String d, double hr, int hw)
	       {
	    	   Employee e=new HourlyEmployee(n,I,d,hr,hw);
	    	   addNewEmployee(e);
	    	   
	       }
	       
	      public void addNewEmployee(String n, String I, String d, double p, double s)
	      {
	    	Employee e= new CommissionEmployee(n,I,d,p,s);
	    	 addNewEmployee(e);
	      }
	      
	      public Employee findEmployee(String id) {
	    	  int i;
	    	  boolean found=false;
	    	  
	    	  for(i=0;i<employees.length;i++)
	    	  {
	    		  if(employees[i].id.equals(id))
	    		  {
	    			  found=true;
	    			  break;
	    		  }
	    	  }
	    	  if(found==true)
	    		  return employees[i];
	    	  else
	    		  return null;
	    		     	  
	      }
	      
	      public void increaseSalary(String id, double amt)
	      {
	    	 
	    	  Employee e=findEmployee(id);
	    	  if(e!=null) {
	    	     e.increaseSalary(amt);
	    	  }
	    	  else
	    		  System.out.println("Employee not found");
	    	  
	      }
	      
	      public double getSalary(String id)
	      {
	    	  Employee e=findEmployee(id);
	    	  if(e!=null) {
	            return e.getSalary();
	    	  }
	    	  else
	    		  return 0;
	      }
	      public void display() {
	    	  int i;
	    	  for(i=0;i<employees.length;i++)
	    	  {
	    		  if(employees[i]!=null)
	    		  {
	    			  employees[i].display();
	    		  }
	    		  else
	    			  break;
	    	  }
	      }
	}

