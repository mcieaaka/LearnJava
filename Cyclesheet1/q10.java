//By Harshit: Use stack for easy imp
import java.util.*;
public class q10
{
	public static void main(String args[])
	{
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
		/*temp = n;
		System.out.println("Octal:");
		if(temp<8)
			System.out.println(n);
		else
		{
			while(temp!=0)
			{
				System.out.print(temp%8);
				temp=temp/8;
			}
		}*/
	}
}	