import java.util.*;
public class q13
{
	static void cmp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String s1 = new String();
		String s2 = new String();
		s1= sc.next();
		s2=sc.next();
		System.out.println(s1.compareTo(s2));
	}
	static void Get_char()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String and an index");
		String s1 = new String();
		s1= sc.next();
		int i = sc.nextInt();
		System.out.println(s1.charAt(i));
	}
	static void ext()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string, start index and end Index");
		String s1 = new String();
		s1= sc.next();
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(s1.substring(s,e));
	}
	static void rep()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Strings, a character and another character to replce with");
		String s1 = new String();
		s1= sc.next();
		char c = sc.next().charAt(0);
		char r = sc.next().charAt(0);
		System.out.println(s1.replace(c,r));
	}
	static void getp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String and a Substring/character");
		String s1 = new String();
		String s2 = new String();
		s1= sc.next();
		s2=sc.next();
		System.out.println(s1.indexOf(s2));
	}
	public static void main(String args[])
	{
		System.out.println("Harshit Srivastava 19BCE0382");
		Scanner sc = new Scanner(System.in);
		int c;
		while(true)
		{
			System.out.println("EnterChoice:\n1.Compare\n2.Get_char\n3.Extract substring\n4.replace Char\n5.Get position\n6.Exit");
			c = sc.nextInt();
			switch(c)
			{
				case 1:
					cmp();
					break;
				case 2:
					Get_char();
					break;
				case 3:
					ext();
					break;
				case 4:
					rep();
					break;
				case 5:
					getp();
					break;
				case 6:
					System.exit(0);
					break;
				default: 
					System.out.println("Wrong Choice");
					break;
			}
		}
	}
}