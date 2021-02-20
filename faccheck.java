import java.util.*;
public class faccheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,p=1;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		for (int i=1; i<=n1;i++)
		{
			p=p*i;
		}
		if(p==n2)
			System.out.println("1st no.'s factorial = n2");
		else
			System.out.println("1st no.'s factorial is not= n2");
	}
}