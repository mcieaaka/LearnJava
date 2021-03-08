import java.util.*;
public class q14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s2;
		System.out.println(s);
		char temp;
		for(int i=0;s.length;i++)
		{
			if(s.charAt(i).isLowercase())
			{
				temp=s.charAt(i).toUpperCase();
				
			}
			else
				s[i].toLowerCase();
		}
		System.out.println(s);
	}
}