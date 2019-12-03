package LAB01;
import java.util.Scanner;
public class Q2H {

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
			int zero=0;
			int one=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					zero++;
				}
				if(arr[i]==-1) {
					one++;
				}
			}
			if(zero>0 && one>0) {
				System.out.println("the array contains 0 and -1");
			}
			if(zero>0 && one==0) {
				System.out.println("the array contains only 0");
			}
			if(zero==0 && one>0) {
				System.out.println("the array contains -1");
			}

		}

	


}
