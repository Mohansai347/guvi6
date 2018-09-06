import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	           int first=1;
		int second=1,next;
		if(n==1)
		     System.out.print(first);
		else if(n==2)
		  System.out.print(first+" "+second);
	          else
	          {
		System.out.print(first+" "+second);
		for(int i=2;i<n;i++)
		{
			next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
		}
	          }
	}
}
