import java.util.*;
public class q11
{
	static void Concatenate()
	{
		String s1 = "abc";
		String s2 = "def";
		String s3 = s1+s2;
		System.out.println("S1="+s1+" S2="+s2);
		System.out.println("Concatenated: "+s3);
	}
	static void insert()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a String");
		String s1 = sc.next();
		System.out.println("You inserted:"+s1+"\n");
	}
	static void del()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a String");
		String s1 = sc.next();
		System.out.println("What portion do you want to delete?");
		String s2 = sc.next();
		System.out.println("After Removing: "+s1.replace(s2,""));
	}
	
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc = new Scanner(System.in);
		int c;
		while(true)
		{
			System.out.println("EnterChoice:\n1.Concatenate\n2.Insert\n3.Delete a portion\n4.Exit");
			c = sc.nextInt();
			switch(c)
			{
				case 1:
					Concatenate();
					break;
				case 2:
					insert();
					break;
				case 3:
					del();
					break;
				case 4:
					System.exit(0);
					break;
				default: 
					System.out.println("Wrong Choice");
					break;
			}
		}
	}
}