/**
* java program to rotate an array using reversal algorithm
* http://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
*/

public class Solution
{
	private static int[] arr = {1,2,3,4,5,6,7};
	private static final int d = 2;

	public static void main(String[] args)
	{
		rotate(0,d);
		printArray();
		rotate(d+1,arr.length-1);
		printArray();
		rotate(0,arr.length-1);
		printArray();

	}

	private static void rotate(int start,int end)
	{
		if(start>end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		rotate(start+1,end-1);
	}

	private static void printArray()
	{
		System.out.println("");
		
		for(int x=0;x<arr.length;x++)
			System.out.print(" "+arr[x]);

		System.out.println("");
	}
}
