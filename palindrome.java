import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n, m, a = 0,x;
        Scanner s = new Scanner(System.in);
         n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        if(a == m)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
	}
}
