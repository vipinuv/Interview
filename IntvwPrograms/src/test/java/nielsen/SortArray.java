package nielsen;

public class SortArray
{
	static void sort(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr = { 1, 7, 6, 3, 4 };
		sort(arr);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");

		}
	}
}
