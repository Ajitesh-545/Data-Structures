package LAB01;
import java.util.Scanner;
public class Q2C {
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
		System.out.println("enter the value for finding index:");
		int c=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==c) {
				System.out.println("the index is:"+i);
				break;
			}
		}

	}




}
