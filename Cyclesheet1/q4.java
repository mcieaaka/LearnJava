import java.util.*;
public class q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		int t,ctr=0,i;
		t= sc.nextInt();
		for (i=1;i<=t;i++)
		{
			if(t%i==0)
				ctr++;
		}
		if(ctr==2)
			System.out.println(t+" is a prime no.");
		else
			System.out.println(t+" is not a prime no.");
	}
}