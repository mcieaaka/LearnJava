import java.lang.*;
import java.util.*;
public class q5
{
public static void main(String args[])
{
	int i,j;
	System.out.println("(i)Pattern 1:");
	for(i=1; i<=3; i++)
	{
		for (j=1; j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println("");
	}
	System.out.println("(ii)Pattern 2:");
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=3-i;j++)
		{
			System.out.print(" ");
		}
		for(j=i;j>0;j--)
		{
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println("");
	}
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=3-i;j++)
		{
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println("");
	}
}
}