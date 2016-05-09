/**
* java program to implement Merge sort Top-down order
*/

public class Solution
{
	private static final int arr[] = {3,45,21,88,11,1,71,98,91,24,22,37,23,25};
	public static void main(String[] args)
	{
		sort(0,arr.length-1);

		for(int x:arr)
			System.out.println(x);

	}

    /**
    * method to divide the array into sub arrays
    */
	private static void sort(int lo,int hi)
	{
		if(lo>=hi)
			return;

		int mid = lo + (hi-lo)/2;

		sort(lo,mid);
		sort(mid+1,hi);
		merge(lo,mid,hi);

	}

	/**
	* method to merge the sub-arrays
	*/
	private static void merge(int lo,int mid,int hi)
	{
		int i = lo;
		int j = mid + 1;
		int[] aux = new int[hi+1];
		
		for(int k=lo;k<=hi;k++)
			aux[k] = arr[k];

		for(int k=lo;k<=hi;k++)
		{
			if(i>mid)
				arr[k] = aux[j++];
			else if(j>hi)
				arr[k] = aux[i++];
			else if(aux[j]<aux[i])
				arr[k] = aux[j++];
			else
				arr[k] = aux[i++];
		}

	}
}
