import java.util.*;
public class q7
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n,i,j,t;
		System.out.println("enter size");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter "+n+" no.s");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Sorted:");//Bubble Sort
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}