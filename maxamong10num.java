import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		for(int i=0;i<8;i++)
		 a[i]=sc.nextInt();
		 int large=a[0];
		 for(int i=1;i<8;i++)
		 {
		 	if(large<a[i])
		 	large=a[i];
		 }
		System.out.print(large);
	}
}
