public class Solution2
{

	public static void solution(int[] T)
	{
		int low=T[0];
		int i=0;
		for( i=1;i<T.length;i++)
		{
			if(low<T[i])
			{
				break;
			}
		}

		System.out.println(i);

	}

	public static void main(String[] args)
	{
		int[] T = {-5, -5, -5, -42, 6, 12};
		solution(T);
	}
}
