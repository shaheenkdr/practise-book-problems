/**
* Java program to implement Shell sort using
* empirically derived sequence
*/
public class Solution
{
	private static final int arr[] = {9,4,5,1,2,8,7,6,12,45,21,34,1,2,3};
	private static final int gap[] = {1,4,10,23,57,132,301,701};
	public static void main(String[] args)
	{
		int N = arr.length;
		int h = -1,y = 0;
		while(true)
		{	
			if(gap[y]<N)
				++h;
			else
				break;
			++y;
		}
		
		while(h>=0)
		{
			for(int i=gap[h];i<N;i++)
			{
				for(int j=i;j>=gap[h] && arr[j-gap[h]]>arr[j];j-=gap[h])
				{
					int temp = arr[j-gap[h]];
					arr[j-gap[h]] = arr[j];
					arr[j] = temp;
				}
			}
			--h;
		}

		for(int x:arr)
			System.out.println(x);

	}
}
