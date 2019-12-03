package LAB01;
import java.util.Scanner;
public class Q2A {
	static void sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum is:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the numbers:");
		for(int i=0;i<arr.length;i++) {	
			int b=sc.nextInt();
			arr[i]=b;
		}
		sum(arr);
	}

}
