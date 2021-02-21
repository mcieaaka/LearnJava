import java.util.*;
public class q9
{
	public static void Sum(int a[])
	{
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		System.out.println("Sum="+s);
	}
	
	public static void Mean(int a[])
	{
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		float m=s/a.length;
		System.out.println("Average="+m);
	}
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size");
		n=sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the no.s");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Sum(a);
		Mean(a);
	}
}