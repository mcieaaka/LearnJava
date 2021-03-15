import java.util.*;
public class q3
{
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc = new Scanner(System.in);
		int i,n,t,t2,s=0;
		System.out.println("Enter a no. to check Armstrong");
		n=sc.nextInt();
		t=n;
		while(t!=0)
		{
			t2=t%10;
			s= s+(t2*t2*t2);
			t=t/10;
		}
		if(s==n)
			System.out.println(n+" is an Armstrong No.");
		else
			System.out.println(n+" is not an Armstrong no.");
	}
}