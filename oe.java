/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
	            Scanner in = new Scanner(System.in);
		a=in.nextInt();
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
