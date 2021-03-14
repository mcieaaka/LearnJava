import java.util.*;
public class Stringfunc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		String s = new String();
		s=sc.next();
		char ch[] = s.toCharArray();
		int i,j;
		for(i=0;i<ch.length;i++)
		{
			int ctr = 1;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ctr++;
					ch[j]='\0';
				}
			}
			System.out.println(ch[i]+"="+ctr);
		}
	}
}