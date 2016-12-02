package capitolo2;

import java.io.*;
import java.util.*;

public class HourlyCompany extends Company {

	public static void main(String[] args) throws FileNotFoundException {
		new HourlyCompany().run();
	}//metodo run

	protected HourlyEmployee getNextEmployee(Scanner sc){
		Scanner lineScanner = new Scanner(sc.nextLine());
		String name = lineScanner.next();
		int hoursWorked = lineScanner.nextInt();
		double payRate = lineScanner.nextDouble();
		return new HourlyEmployee(name, hoursWorked, payRate);
	}//metodo getNextEmployee

}//class HourlyEmployee
