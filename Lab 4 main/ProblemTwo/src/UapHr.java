import java.util.Scanner;

public class UapHr {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		String name = scan.next();
		String id = scan.next();
		String designation = scan.next();
		double salary = scan.nextDouble();
		
		Employee emp = new Employee(name, id, designation, salary);
		emp.updateSalary(1000);
		System.out.println(emp.salary);
		emp.display();
	}
}