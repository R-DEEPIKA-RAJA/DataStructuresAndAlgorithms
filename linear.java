package datastructuresandalgorithms;

public class linear
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6};
		int target = 61 ;
		int index = linearsearch(arr, target);
		System.out.println(index);
	}
	static int linearsearch(int arr[], int tar)
	{
		for(int i = 0 ; i< arr.length ; i ++)
		{
			if(tar==arr[i])
			{
				return i ;
			}
		}
		return 1 ;
	}

}
