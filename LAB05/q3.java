package LAB05;

import java.util.Scanner;

public class q3 {
	
	public static void main(String[] args) 
	{
		System.out.println("### Print Unique Nodes ###");
		
		NumberList numbers= new NumberList();
		Scanner sc = new Scanner(System.in);
		numbers.init();
		
		System.out.println("Original List");
		numbers.print();
		
		System.out.println("\nUnique List");
		numbers.unique();
		numbers.print();

	}

}
