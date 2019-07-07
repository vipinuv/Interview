package nielsen;

public class PrintNames
{
	static  void   printName(int n)
	{
		if(n>1)
		{
			printName(n-1);
		}
		System.out.println("name");
	}

	public static void main(String[] args)
	{
		printName(100);
	}

}
