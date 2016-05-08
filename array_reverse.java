/**
* Java program to reverse an array using recursion
* http://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
*/
import java.util.Scanner;
public class Solution
{
	private static final int arr[] = {1,2,3,4,5,6,7,8};
	public static void main(String[] args)
	{
		int N = arr.length;
		flip(0,N-1);

		for(int x:arr)
			System.out.println(x);
	}

	private static void flip(int start,int end)
	{
		if(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			flip(start+1,end-1);
		}
	}
}
