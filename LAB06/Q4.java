package LAB06;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		
		System.out.println("### Reverse Pyramid ###");
		
		Linkedlist numbers= new Linkedlist();
		Scanner sc = new Scanner(System.in);
		 
		numbers.init();
		
		System.out.println("Original List");
		numbers.print();

		System.out.println("\nReverse Pyramid");
		numbers.remGreater();
		numbers.print();
	}
	
	
}