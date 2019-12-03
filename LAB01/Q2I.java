package LAB01;
import java.util.Scanner;

public class Q2I {
		static int fact(int n) {
			if(n>0) {
				return n*fact(n-1);
			}
			else {
				return 1;
			}
		}
		static int fibb(int n) {
			if(n>2) {
				return fibb(n-1)+fibb(n-2);
			}
			else {
				return 1;
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the number for factorial:");
			int a=sc.nextInt();
			System.out.println(fact(a));
			System.out.println("enter the number for fibbonaci:");
			int b=sc.nextInt();
			System.out.println(fibb(b));
			

		}


}
