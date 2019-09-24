package DataStructure.sort;

public class InsertionSort
{
	public static  void sort(int[] initArray)
	{

		for(int firstUnsortedIndex=1;firstUnsortedIndex <initArray.length ;firstUnsortedIndex++)
		{
			int newElement=initArray[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex; i>0 && initArray[i-1] > newElement;i--)
			{
				initArray[i]=initArray[i-1];
			}
			initArray[i]=newElement;
		}

		for(int i=0;i<initArray.length;i++)
		{
			System.out.println(initArray[i]);
		}
	}

	public static void main(String[] args)
	{
		int[] initArray={35,20,-15,7,55,1,-22};
		sort(initArray);
	}
}
