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
		try
		{
			if(reg.length()!=9 || phn.length()!=10)
			{
				throw new IllegalArgumentException("IAE: Reg. no. !=9 or Phn. no. != 10");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}