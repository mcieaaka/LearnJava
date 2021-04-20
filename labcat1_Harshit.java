import java.util.*;

public class labcat1_Harshit
{
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter PAN number(All Uppercase): ");
			String pan = sc.next();
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			if (pan.length() != 10 || name.isEmpty()) 
			{
				throw new IllegalArgumentException("The PAN no. is not of length 10 or Name is empty");
			}
			int ctr=0;
			for (int i = 0; i < pan.length(); i++)
			{
				if (!(Character.isLetterOrDigit(pan.charAt(i)))) 
				{
					ctr++;
				}
			}
			if (ctr!=0)
			{
				throw new NoSuchElementException("Pan has other chars excluding numbers and alphabets");
			}
			
			int i,ctr2=0;
			
			if(Character.isDigit(pan.charAt(0)))
				ctr2++;
			else if(pan.charAt(4)!=name.charAt(0))
				ctr2++;
			else if(!(Character.isLetter(pan.charAt(9))))
				ctr2++;
			for(i=1;i<=4;i++)
			{
				if(!Character.isLetter(pan.charAt(i)))
					ctr2++;
			}
			for (i =5 ; i <= 8; i++) 
			{
				if (!(Character.isDigit(pan.charAt(i)))) 
				{
					ctr2++;
				}
			}
			if(ctr2==0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}