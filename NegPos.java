class NegPos
{
	public static void main(String a[])
	{
		int arr[]={-5,-8,6,-7,4,-2};
		int countPos=0,countNeg=0;
		for(int i=0;i<6;i++)
		{
			if(arr[i]>0)
			{
				countPos++;
			}
			else
			{
				countNeg++;
			}
		}
		System.out.println("Positive count = "+countPos);
		System.out.println("Negative count = "+countNeg);
	}
}