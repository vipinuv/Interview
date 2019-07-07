package nielsen;

public class StringCompress
{
	/*
	 aabb =>a2b2
	 */
	public static String compressString(String s)
	{
		char temp = s.charAt(0);
		int j = 1;
		StringBuffer str = new StringBuffer();
		int n = s.length();
		for (int i = 1; i < n; i++)
		{
			if(temp == s.charAt(i))
			{
				++j;
			}
			else
			{
				str.append(temp).append(j);
				j = 1;
				temp = s.charAt(i);
			}
			if(n - 1 == i)
			{
				str.append(temp).append(j);
			}
		}
		return str.toString();
	}

	public static void main(String[] args)
	{
		System.out.println(compressString("abcabcaaaaaaaaaaaaaabc"));

	}
}
