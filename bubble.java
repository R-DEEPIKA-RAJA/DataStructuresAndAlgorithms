package datastructuresandalgorithms;

import java.lang.reflect.Array;

public class bubble 
{
	public static void main(String[] args) 
	{
		
		int arr[]= {3,1,5,4,2};
		bubblesort(arr);
		for(int i = 0 ; i < arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}
	
	
	static void bubblesort(int arr[])
	{
		for(int i=0 ; i< arr.length;i++)
		{
			for(int j = 1; j<=arr.length-i-1;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	

}
