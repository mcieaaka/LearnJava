import java.util.*;
public class q12
{
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		String s2="";
		int i;
		for(i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		if(s2.equals(s))
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
	}
}