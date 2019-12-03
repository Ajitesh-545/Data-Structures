package LAB01;
import java.util.Scanner;
public class Q2F {
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
			int min=arr[0];
			int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(min>arr[i]) {
					min=arr[i];
				}
			}
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) {
					max=arr[i];
				}
			}
			System.out.println("the minimum and maximum values are:"+min+" "+max);
			

		}

	}


