public class HourlyEmployee extends Employee{

	       
		public double hourlyRate;
		public int hourWorked;
		
		public HourlyEmployee(String name, String id, String designation, double hourlyRate, int hourWorked) {
			super(name, id, designation);
			this.hourlyRate = hourlyRate;
			this.hourWorked = hourWorked;
		}
		
		@Override
		public void increaseSalary(double amt) {
			this.hourlyRate+=amt;
		}

		@Override
		public double getSalary() {
			return hourlyRate*hourWorked;
		}
		
		public void display() {
	  		System.out.println("Name:"+name+"\n Id:"+id+"\n Designation:"+designation);
	  	}
	  	
	  	@Override
	  	public String toString() {
	  		return "Name:"+name+"\n Id:"+id+"\n Designation:"+designation;
	       
	   	}

		
	}


