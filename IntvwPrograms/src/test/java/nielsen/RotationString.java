package nielsen;

/**
 * 1) Find if a string is rotation of another string ex. abcd , dabc is rotation of abcd
 *
 */
public class RotationString
{

	public static boolean isRotationstring(String s1, String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					if(s1.length()-1==i)
					{
						return  true;
					}
					break;
				}
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
        System.out.println(isRotationstring("abcd","dcba"));
	}
}
