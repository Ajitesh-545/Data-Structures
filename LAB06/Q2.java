package LAB06;

public class Q2 {
	public static void main(String[] args) {
		
		Linkedlist numbers1 = new Linkedlist();
		Linkedlist numbers2 = new Linkedlist();

		numbers1.init();
		numbers2.init();

		System.out.println("List1");
		numbers1.print();
		System.out.println("\nList2");
		numbers2.print();
		
		System.out.println("\nJoined List");
		Linkedlist joined = new Linkedlist(Linkedlist.Intersection(numbers1, numbers2));
		joined.print();
	}

}
