/**
 * Given two sorted arrays of N int values, print all elements that 
 * appear in both arrays, in sorted order.The running time should
 * be proportional to O(n) in worst case.
 */

public class ArrayPair
{
	private static int[] a1 = {1,2,3,4,5};
	private static int[] a2 = {5,6,7,8,9};
	
	public static void main(String[] args)
	{
		compute();

	}

	private static void compute()
	{
		int i=0,j=0;
		while(true)
		{
			if(i>4)
				break;

			if(a1[i]==a2[j])
			{
				System.out.println(a1[i]);
				++i;
			}

			else if(a1[i]<a2[j])
				++i;
			else if(a1[i]>a2[j])
				++j;
			
		}

	}

	
}
