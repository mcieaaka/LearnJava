import java.util.*;
public class q6
{
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		int a=0,b=1,i=0,temp;
		System.out.println("Fibonacci Series:");
		System.out.print(a+" "+b+" ");
		int c=a+b;
		while(i!=10)
		{
			System.out.print(c+" ");
			temp=c;
			c=c+b;
			b=temp;
			i++;
		}
	}
}