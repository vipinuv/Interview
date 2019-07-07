package nielsen;

public class MagicFountain
{
	static int fountainTime(int[] arr)
	{
		int max=0;
		int val=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int j=1;
		val=max;
		for(int i=0;i<arr.length-1;i++)
		{
			if(val%arr[i]!=0)
			{
				j++;
				val=max*j;
				i=0;
			}

		}
		return val;

	}

	public static void main(String[] args)
	{
		int[] arr={2,3,1,1};
		System.out.println(fountainTime(arr));
	}


}
