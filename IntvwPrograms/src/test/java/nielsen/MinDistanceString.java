package nielsen;

/**
 * 1) Find min distance between two character in a string ex. a x c a e r r a d e min dis between a and e is 1
 */
public class MinDistanceString
{
	public static int minDistance(String s, char c1, char c2)
	{
		int temp=0;
		int temp1=temp;
		boolean flag=false;
		for (int i = 0; i < s.length(); i++)
		{
			if(flag)
			{
                 temp++;
			}
			if(s.charAt(i) == c1)
			{
				flag=true;
				temp=0;
			}
			if(s.charAt(i) == c2)
			{
				if(flag)
				{
					flag = false;
					if(temp1 == 0 | temp1 > temp)
					{
						temp1 = temp;
					}
					temp = 0;
				}
			}
		}
		return temp1;
	}
	public static void main(String[] args)
	{
		System.out.println(minDistance("axcaerrade", 'a', 'e'));
	}
}
