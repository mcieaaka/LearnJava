//By Harshit: Use stack for easy imp
import java.util.*;
public class q10
{
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n = sc.nextInt();
		int temp=n;
		Stack<Integer> s1 = new Stack<Integer>();
		System.out.println("Binary:");
		while(temp!=0)
		{
			s1.push(temp%2);
			temp=temp/2;
		}
		while(s1.size()!=0)
		{
			System.out.print(s1.pop());
		}
		System.out.println();
		System.out.println("Octal="+Integer.toOctalString(n));
		System.out.println("Hexadecimal="+Integer.toHexString(n));
	}
}	