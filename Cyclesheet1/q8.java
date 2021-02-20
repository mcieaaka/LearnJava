import java.util.*;
public class q8
{
	public static int Binary(int a[],int n, int s,int f, int l)
	{
		int mid=(f+l)/2;
		if(s>a[mid])
		{
			f=mid+1;
			return Binary(a,n,s,f,l);
		}
		else if(s<a[mid])
		{
			l=mid-1;
			return Binary(a,n,s,f,l);
		}
		else if(s==a[mid])
		{
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,s;
		System.out.println("enter size:");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" no.s in sorted form.");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter no. to be searched");
		
		s=sc.nextInt();
		int f=0;
		int l=n-1;
		int res=Binary(a,n,s,f,l);
		if(res==1)
			System.out.println("S is in A");
		else
			System.out.println("S is not in A");
	}
}