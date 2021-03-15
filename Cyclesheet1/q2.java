import java.util.*;
public class q2
{
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc = new Scanner (System.in);
		int i,n;
		System.out.println("Enter a no. to find its table:");
		n= sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}