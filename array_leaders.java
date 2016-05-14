/**
* java program to find leader in an array
* http://www.geeksforgeeks.org/leaders-in-an-array/
*/

public class Solution
{
	private static final int[] arr = {16,17,4,3,5,2};

	public static void main(String[] args)
	{
		int max = arr.length-1;
		System.out.println(arr[max]);

		for(int i=max-1;i>0;i--)
		{
			if(arr[max]<arr[i])
			{
				max = i;
				System.out.println(arr[max]);
			}

		}
	}
}
