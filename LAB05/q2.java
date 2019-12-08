package LAB05;

import LAB05.NumberList;

public class q2 {
	
	public static void main(String[] args) {
		
		System.out.println("### Print Alternate Nodes ###");
		
		NumberList numbers= new NumberList();
		numbers.init();
		
		System.out.println("Original List");
		numbers.print();

		System.out.println("\nList with Alternate Nodes");
		numbers.print(1);
		
	}
	
}
