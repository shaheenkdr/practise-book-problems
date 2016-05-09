/**
* Java program to find an element in a sorted and rotated array
* http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
*/

public class Solution
{
	private static final int[] arr = {4,5,6,7,8,9,1,2,3};
	public static void main(String[] args)
	{
		int x = findPivot(0,arr.length-1);

		int res = binary_search(0,x,1);

		if(res==0)
			res = binary_search(x+1,arr.length-1,1);

		if(res!=0)
			System.out.println("hooray:"+res);
		else
			System.out.println("oops:/ cannot find");




	}

	private static int findPivot(int lo, int hi)
	{
		if(lo>hi)
			return 0;

		int mid = lo + (hi-lo)/2;

		if(arr[mid]>arr[mid+1])
			return mid;

		else if(arr[mid]<arr[mid-1])
			return mid-1;
		
		else if(arr[lo]>=arr[mid])
			return findPivot(lo,mid);

		return findPivot(mid+1,hi);
	}

	private static int binary_search(int lo,int hi,int key)
	{
		if(lo>=hi)
			return 0;
		int mid = lo + (hi-lo)/2;

		if(arr[mid]==key)
			return mid;

		else if(arr[mid]<key)
			return binary_search(mid+1,hi,key);

		else if(arr[mid]>key)
			return binary_search(lo,mid,key);

		return 0;
	}
}
