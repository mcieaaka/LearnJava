import java.util.*;
public class q14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = new String();
		s=sc.next();
		System.out.println(s);
		String s2 = new String();
		s2="";
		String s3 = new String();
		char temp;
		for(int i=0;i<s.length();i++)
		{
			temp=s.charAt(i);
			s3=String.valueOf(temp);
			if(Character.isUpperCase(temp))
			{
				s3=s3.toLowerCase();
			}
			else
				s3=s3.toUpperCase();
			
			s2 = s2+s3;
		}
		System.out.println(s2);
	}
}