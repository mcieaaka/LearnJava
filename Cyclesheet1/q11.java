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
	/*void del()
	{
	}*/
	
	public static void main(String args[])
	{
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