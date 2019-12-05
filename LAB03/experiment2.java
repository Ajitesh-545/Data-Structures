package LAB03;
import LAB03.quicksort;
import java.util.Scanner;
public class experiment2 {

	public static void print1d(int[] arr) {
		for (int t = 0; t < arr.length; t++)
        	System.out.print(arr[t] + " ");
		System.out.println();
	}
	
	public static void print2d(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
			print1d(arr[i]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[][] arr2d = { { 1, 5, 13, 29 }, 
						{ 11, 16, 25, 38 },
						{ 45, 49, 52, 57},
						{ 51, 54, 59, 66}};
		Scanner fno=new Scanner(System.in);
		System.out.println("Enter the number you'll like to find");
		
		int find =fno.nextInt();
		
		
	
		boolean found = false;
		
		print2d(arr2d);
		
		int arr1d[]=new int[arr2d.length*arr2d[0].length];
		int arr1dLength = 0;
		
		for (int i = 0; i < arr2d.length; i++) { 
            for (int j = 0; j < arr2d[i].length; j++) { 
            	if (arr2d[i][j] == find)
            		found = true;
            	arr1d[arr1dLength] = arr2d[i][j];
            	arr1dLength+=1;
            } 
        }
		
        quicksort qs = new quicksort(); 
        qs.sort(arr1d, 0, arr1dLength-1);
        
        for (int i = 0; i < arr2d.length; i++)
            for (int j = 0; j < arr2d[i].length; j++)
            	arr2d[i][j] = arr1d[(i*arr2d.length) + j]; 
        
        print2d(arr2d);
        System.out.println(find + ":" +found);

	}
	
}



