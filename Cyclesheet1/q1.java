import java.util.*;
public class q1
{
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. to find its factorial");
		int i,t,p=1;
		t=sc.nextInt();
		for(i=1;i<=t;i++)
		{
			p=p*i;
		}
		System.out.println("Factorial of "+t+" is = "+p);
	}
}