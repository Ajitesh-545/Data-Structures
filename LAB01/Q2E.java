package LAB01;
import java.util.Scanner;

public class Q2E {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the length of the array:");
			int a=sc.nextInt();
			int arr[]=new int[a];
			int arr1[]=new int[a+1];
			System.out.println("enter the numbers:");
			for(int i=0;i<arr.length;i++) {	
				int b=sc.nextInt();
				arr[i]=b;
			}
			System.out.println("enter the value for inserting:");
			int c=sc.nextInt();
			System.out.println("enter the index value:");
			int d=sc.nextInt();
			for(int i=0;i<d;i++) {
				arr1[i]=arr[i];
			}
			arr1[d]=c;
			for(int i=d;i<arr.length;i++) {
				arr1[i+1]=arr[i];
			}
			for(int i=0;i<arr1.length;i++) {
				System.out.print(arr1[i]+" ");
			}

		}

	}


