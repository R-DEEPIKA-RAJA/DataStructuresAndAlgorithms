package datastructuresandalgorithms;

public class binary 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6};
		int target = 69;
		int ans=binarysearch( arr, target);
		System.out.println(ans);
	}
	
	public static int  binarysearch( int[] arr, int tar)
	{
		int s=0;
	    int e= arr.length-1;
		while ( s<=e)
		{	
		int mid = (s+e)/2;
		if(tar==arr[mid]) 
		{
			return mid;
		}
		else if (tar < arr[mid] )
		{
			e = mid - 1;
		}
		else
		{
			s= mid + 1;
		}
		}
		return 1 ;

		 
	}
	}
