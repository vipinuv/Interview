package com.test.DataStructure.sort;

public class SelectionSort
{

	public static  void sort(int[] initArray)
	{

		for(int unSortedIndex=initArray.length-1;unSortedIndex>0;unSortedIndex--)
		{
			int largest=0;

			for(int i=1;i<=unSortedIndex;i++)
			{
				if(initArray[i]>initArray[largest])
				{
					largest=i;
				}
			}
			swap(initArray,largest,unSortedIndex);
		}

		for(int i=0;i<initArray.length;i++)
		{
			System.out.println(initArray[i]);
		}

	}

	public static void swap(int[] array,int i ,int j)
	{
		if(i==j)
		{
			return;
		}
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;

	}
	public static void main(String[] args)
	{

		int[] initArray={20,35,-15,7,55,1,-22};
		sort(initArray);

	}
}
