package openet;

public class Soccer
{

	public static void main(String[] args)
	{
		Soccer s = new Soccer();
		int[] wins = { 13, 79, 26, 73, 14, 89, 71, 37, 89, 71, 19, 59, 39 };
		int[] ties = { 88, 27, 5, 70, 84, 94, 20, 50, 2, 11, 31, 22, 50 };
		System.out.println(s.maxPoints(wins, ties));

	}

	public int maxPoints(int[] wins, int[] ties)
	{
		int maxPt = 0;
		int tempMax = 0;

		if((wins.length < 51 && ties.length < 51) &&
				(wins.length == ties.length))
		{
			for (int i = 0; i < wins.length; i++)
				 {
			maxPt = (wins[i] * 3) + (ties[i] * 1);
			if(tempMax > maxPt)
			{
				maxPt = tempMax;
			}
			else
			{
				tempMax = maxPt;
			}
		}
		}
		{
			System.out.println(" Wins and Ties count doesn't matches");
		}

		return maxPt;
	}
}
