package nielsen;

import java.util.concurrent.ExecutionException;

public class Tester
{

	public static void main(String[] args)
	{
		try
		{
           System.out.println(doStuff("x"));
		}
		catch(Exception e)
		{
			System.out.println("exec");
		}
		doStuff("x");

	}

	static  int doStuff(String s)
	{
		return Integer.parseInt(s);


	}
}
