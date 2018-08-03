import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,c=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
			
		}
		
	}

}
