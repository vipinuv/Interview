package nielsen;

public class CheckPalindrome
{

	public static boolean isPalin(String s)
	{
		int n=s.length()-1;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)!=s.charAt(n-i))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println(isPalin("abaab"));
	}
}
