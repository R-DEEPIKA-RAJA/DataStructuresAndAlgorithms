package datastructuresandalgorithms;

public class bubblesortt 
{
	public static void main( String args[])
	{
		int arr[]= { 2,7,5,3,8,9,0};
		int[] array = bubble(arr);
		for(int i =0 ; i<array.length;i++)
		{
			System.out.print(array[i]);
		}
	}
	
	public static int[] bubble(int arr[])
	{
		for(int i =0 ; i< arr.length; i++)
		{
			for(int j = 0 ; j<arr.length-i-1;j++  )
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
