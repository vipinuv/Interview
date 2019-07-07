package nielsen;

public class CheckSorted
{
	static boolean isSorted(int[] ar,int n)
	{
		if(n==0 |n==1)
		{
			return true;
		}
		if(ar[n-1]<ar[n-2])
		{
			return false;
		}
		return isSorted(ar,n-1);
	}
	public static void main(String[] args)
	{
		int[] ar={1,2,3,4};
		System.out.println(isSorted(ar,4));
	}
}
