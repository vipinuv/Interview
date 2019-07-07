package nielsen;

public class ArrayRotation
{
	public static void rotateArray(int[] arr)
	{
		int n=arr.length;
        int[] temp=arr.clone();
		for(int j=n;j>0;j--)
		{
			arr[n-j]=temp[j-1];
		}

	}

	static void printArray(int[] arr,int n)
	{
		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}

	public static void leftRotate(int[] arr, int d, int l)
	{
      for(int i=0;i<d;i++)
      {
      	rotateOne(arr,l);
      }

	}

	public static void rotateOne(int[] arr,int l)
	{
		int j,temp=arr[0];
		for( j=0;j<l-1;j++)
		{
          arr[j]=arr[j+1];
		}
		arr[j]=temp;

	}

	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
        rotateArray(arr);
		printArray(arr,5);
		leftRotate(arr,1,5);
		printArray(arr,5);

	}
}
