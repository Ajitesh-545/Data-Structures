package LAB06;

public class Q3 {
	public static void main(String[] args) {
		

	System.out.println("### Identical ###");
	
	Linkedlist numbers1 = new Linkedlist();
	Linkedlist numbers2 = new Linkedlist();

	numbers1.init();
	numbers2.init();

	System.out.println("List1");
	numbers1.print();
	System.out.println("\nList2");
	numbers2.print();
	
	System.out.println(numbers1.isSameAs(numbers2));
	
}

}
