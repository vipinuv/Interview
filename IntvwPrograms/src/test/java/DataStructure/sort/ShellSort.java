package DataStructure.sort;

public class ShellSort
{
	public static  void sort(int[] initArray)
	{
		for (int gap=initArray.length/2;gap>0;gap/=2)
		{
			for(int i=gap;i<initArray.length;i++  )
			{
				int newElement=initArray[i];
				int j = i;

				while(j>=gap && initArray[j-gap]>newElement)
				{
					initArray[j]=initArray[j-gap];
					j-=gap;
				}
				initArray[j]=newElement;
			}
		}
		for(int i=0;i<initArray.length;i++)
		{
			System.out.println(initArray[i]);
		}
	}
	public static void main(String[] args)
	{

		int[] initArray={20,35,-15,7,55,1,-22};
		sort(initArray);

	}
}
