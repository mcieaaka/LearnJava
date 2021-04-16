import java.util.*;
public class ques1
{
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Reg. No.");
		String reg = sc.next();
		System.out.println("Enter phone no.");
		String phn = sc.next();
		int c=0;
		try
		{
			if(reg.length()!=9 || phn.length()!=10)
			{
				c++;
				throw new IllegalArgumentException("IAE: Reg. no. !=9 or Phn. no. != 10");
			}
			for(int i=0;i<phn.length();i++)
			{
				if (Character.isDigit(phn.charAt(i)))
				{
					continue;
				}
				else
				{
					c++;
					throw new NumberFormatException("NFE: Not all digits in Phone no.");
				}
			}
			for(int i=0;i<reg.length();i++)
			{
				if(Character.isLetterOrDigit(reg.charAt(i)))
				{
					continue;
				}
				else{
					c++;
					throw new NoSuchElementException("Not all Digits or Letters");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(c==0){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
	}
}