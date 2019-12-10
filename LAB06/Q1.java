package LAB06;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		System.out.println("### Last in front ###");
		
		Linkedlist numbers= new Linkedlist();
		Scanner sc = new Scanner(System.in);
		
		numbers.init();  
		
		System.out.println("Original List");
		numbers.print();

		System.out.println("\nReverse List");
		numbers.lastinfront();
		numbers.print();
	}
	

}
