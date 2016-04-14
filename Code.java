public class Code
{
	private static final int[] arr = {1,2,3,4,7,7,7,7,7,8,9}; 
	public static void main(String[] args)
	{
		try
		{
		    System.out.println(Binary.search(0,10,7));
	    }
	    catch(Exception e){e.printStackTrace();}

	}

	private static class Binary
	{
		private static int search(int lo, int hi, int key)
		{
			int mid = lo+(hi-lo)/2;

			if(arr[mid]>key)
				return search(lo,mid,key);

			if(arr[mid]<key)
				return search(mid,hi,key);

			if(arr[mid]==key)
			{
				while(true)
				{
					if(arr[mid]==arr[mid-1])
					{
						--mid;
					}
						
					else
					{
						break;
					}
				}
				return mid;
			}

			return 0;

		}
	}
}