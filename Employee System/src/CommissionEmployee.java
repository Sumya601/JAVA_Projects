
public class CommissionEmployee extends Employee  {

	      public double commission;
	      public double sale;
		
	      public CommissionEmployee(String name, String id, String designation, double commission, double sale) {
			super(name, id, designation);
			this.commission = commission;
			this.sale = sale;
		}
	    
	  	@Override
	  	public void increaseSalary(double amt) {
	  	       this.commission+=amt;
	  	}

	  	@Override
	  	public double getSalary() {
	  	   return commission*sale;
	  	}
	  	public void display() {
	  		System.out.println("Name:"+name+"\n Id:"+id+"\n Designation:"+designation);
	  	}
	  	
	  	@Override
	  	public String toString() {
	  		return "Name:"+name+"\n Id:"+id+"\n Designation:"+designation;
	       
	   	}

	      
	}

