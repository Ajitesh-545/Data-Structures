package LAB01;

public class Q1C {

	public static void main(String[] args) 
	{
		//upper 
		int l=13,i,j,mid,s;
		mid=(l+1)/2;
		for(i=1;i<=mid;i++)
		{
			for(s=1;s<=mid-i;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(i*2)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//lower
		for(i=1;i<=mid-1;i++)
		{
			for(s=1;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=((2*(mid-i))-1);j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}

	}



}
