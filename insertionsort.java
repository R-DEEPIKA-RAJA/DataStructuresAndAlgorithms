package datastructuresandalgorithms;

public class insertionsort 
{

	public static void main(String[] args) 
	{

		int arr[]= {3,1,5,4,2};
		int n = arr.length;
		for(int i = 1;i<n; i++)
		{
			int key = i;
			int j = i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[i];
				j--;
			}
			arr[j+1]=arr[j];
		}
		for(int i = 0 ; i < arr.length;i++)
		{
		System.out.println(arr[i]);
		}

	}

}
