import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    int base=sc.nextInt();
		int exponent=sc.nextInt();
		long result = 1;
		for (;exponent!= 0; --exponent)
        {
            result *= base;
        }
		System.out.println( result);	
   }
}
