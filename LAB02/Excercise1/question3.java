package LAB02.Excercise1;

import java.util.ArrayList;

public class question3 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> EmployeeDB = new ArrayList<Employee>();
		 
		for (int i = 100; i<=130 ; i++) {
			String diff = Integer.toString(i);

			Employee obj = new Employee(diff, i, "CSE", 10000, "add"+diff, 971738467, diff + "@mail.com", "pos" + diff);
			EmployeeDB.add(obj);
		}
		
		System.out.println(EmployeeDB.get(0).header());
		for (int i = 0; i<30 ; i++) {
			System.out.println(EmployeeDB.get(i).toString());
		}               

	}
}