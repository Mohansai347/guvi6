import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num1;
		int num2;
		int num3;
		Scanner s = new Scanner(System.in);
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();
		if((num1 > num2) && (num1 > num3))
		System.out.println(num1);
		else if((num2 > num1) && (num2 > num3))
		System.out.println(num2);
		else
		System.out.println(num3);
	}
}
