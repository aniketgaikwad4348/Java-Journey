class PrintSeries
{
	public static void main(String[] args)
	{
		for (int i = 12;i <= 16 ;i++ )
		{
			if (i % 2 == 0)
			{
				System.out.println(i*i);
			}
			else if (i % 2 != 0)
			{
				System.out.println(i*i*i);
			}
		}
	}
}
//output = 144,2197,196,3375,256