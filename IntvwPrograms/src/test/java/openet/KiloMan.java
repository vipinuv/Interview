package openet;

public class KiloMan
{


	public int hitsTaken(int[] pattern, String jumps)
	{
		int value=0;
		for(int i=0;i<pattern.length;i++)
		{
			if((jumps.charAt(i)=='S') && (pattern[i]==1 || pattern[i]==2))
			{
				value +=pattern[i];
				return value;
			}
			if((jumps.charAt(i)=='J') && (pattern[i]>=3))
			{
				value +=pattern[i];
				return value;
			}
         value +=pattern[i];
		}

		return value;
	}

	public static void main(String[] args)
	{

		KiloMan man=new KiloMan();
		int[] hits={1,3,2,3,3,1,2,2,1};

		System.out.println(man.hitsTaken(hits,"JJSSSJSSJ"));


	}
}
