package openet;

public class ThePalindrome
{

	public int find(String str)
	{
		for (int i = 0; i < str.length(); ++i)
		{
			if (isPalindrome(str.substring(i)))
				return str.substring(i).length() + 2 * (str.length() - str.substring(i).length());
		}
		return 2 * str.length();
	}


	public boolean isPalindrome(String str)
	{
		for (int i = 0; i < str.length(); ++i)
			if (str.charAt(i) != str.charAt(str.length() - 1 - i))
				return false;
		return true;
	}
	public static void main(String[] args)
	{
		ThePalindrome palindrome=new ThePalindrome();
		System.out.println(palindrome.find("abaa"));
	}

}
