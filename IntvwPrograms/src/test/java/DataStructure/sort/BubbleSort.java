package com.test.DataStructure.sort;

public class BubbleSort
{

	public static  void sort(int[] initArray)
	{
		for(int unsortedIntex=initArray.length-1;unsortedIntex>0;unsortedIntex--)
		{
			for(int i=0;i<unsortedIntex;i++)
			{
				if(initArray[i]>initArray[i+1])
				{
					swap(initArray,i,i+1);
				}
			}

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
