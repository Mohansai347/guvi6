/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    int bs=sc.nextInt();
		int ex=sc.nextInt();
		long result = 1;

        for (;ex!= 0; --ex)
        {
            result *= bs;
        }

        System.out.println( result);	
		
	}
}
