import java.util.*;
public class q14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s=sc.next();
		String s2= new String();
		String s3 = new String();
		System.out.println(s);
		char temp;
		for(int i=0;i<s.length();i++)
		{
			temp=s.charAt(i);
			if(s2.isLowerCase())
			{
				s2.toUpperCase();
			}
			else
				s2.toLowerCase();
			
			s3 =s3+s2;
		}
		System.out.println(s3);
	}
}