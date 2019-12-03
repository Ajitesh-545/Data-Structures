package LAB01;
import java.util.Scanner;
import java.lang.Math;
public class Q2J {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(i==Math.pow(i,3)) {
				System.out.println(i);
			}
		}
		for(int i=100;i<999;i++) {
			int a=i%10;
			int x=(i-a)/10;
			int b=x%10;
			int y=(x-b)/10;
			int c=y%10;
			double sum=Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
			if(sum==i) {
				System.out.println(i);
			}
		}

	}



}
