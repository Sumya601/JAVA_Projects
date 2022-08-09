
public class SalariedEmployee extends Employee{

		public double monthlySalary;

		public SalariedEmployee(String name, String id, String designation, double monthlySalary) {
			super(name, id, designation);
			this.monthlySalary = monthlySalary;
		}
		

		@Override
		public void increaseSalary(double amt) {
			this.monthlySalary+=amt;
		}

		@Override
		public double getSalary() {
			return this.monthlySalary;
		}
		
		public void display() {
	  		System.out.println("Name:"+name+"\n Id:"+id+"\n Designation:"+designation);
	  	}
	  	
	  	@Override
	  	public String toString() {
	  		return "Name:"+name+"\n Id:"+id+"\n Designation:"+designation;
	       
	   	}


	}

