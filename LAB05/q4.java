package LAB05;

public class q4 {
	public static void main(String[] args) {
		
		System.out.println("### Print Unique Nodes ###");
		
		NumberList numbers1 = new NumberList();
		NumberList numbers2 = new NumberList();

		numbers1.init();
		numbers2.init();

		System.out.println("List1");
		numbers1.print();
		System.out.println("\nList2");
		numbers2.print();
		
		System.out.println("\nJoined List");
		numbers1.join(numbers2);
		numbers1.print();

	}
}
