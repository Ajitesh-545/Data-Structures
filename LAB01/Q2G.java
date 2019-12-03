package LAB01;
import java.util.Scanner;
public class Q2G {
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
		for(int i=0;i<arr.length;i++) {
			int count =0;
			int x=0;
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					x++;
				}
			}
			for(int j=0;j<arr.length && x==0;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println("the repeated number is "+arr[i]+" and count is:"+count);
			}
		}

	}




}
