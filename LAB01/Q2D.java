package LAB01;
import java.util.Scanner;
public class Q2D {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the length of the array:");
			int a=sc.nextInt();
			int arr[]=new int[a];
			int arr1[]=new int[a-1];
			System.out.println("enter the numbers:");
			for(int i=0;i<arr.length;i++) {	
				int b=sc.nextInt();
				arr[i]=b;
			}
			System.out.println("enter the value for removing:");
			int c=sc.nextInt();
			int d=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==c) {
					d=i;
					break;
				}
			}
			
			for(int i=0;i<d;i++) {
				arr1[i]=arr[i];
			}
			for(int i=d;i<arr1.length;i++) {
				arr1[i]=arr[i+1];
			}
			for(int i=0;i<arr1.length;i++) {
				System.out.print(arr1[i]+" ");
			}


		}

	}


