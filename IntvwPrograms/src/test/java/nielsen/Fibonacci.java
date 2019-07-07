package nielsen;

/**
 *  1 1 2 3 5 8 etc
 */
public class Fibonacci
{

	public static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args)
	{
		System.out.println(fib(9));
		fibSeries(9);
	}
	public static void  fibSeries(int n)
	{
		int n1=0;
		int n2=1;
		System.out.print(n1+","+n2);
		for(int i=2;i<=n;i++)
		{
			int n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(","+n3);
		}

	}

}
