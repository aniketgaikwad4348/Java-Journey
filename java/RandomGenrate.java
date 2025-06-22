class RandomGenerate
{
	public static void main(String[] args)
	{
		for (int i = 1;i <= 1 ;i++)
		{
			int num = (int)(math.random()*10);
			if (num>= 1 && num<= 3)
			{
				System.out.print(num +" ");
				continue
			}
			i--;
		}
	}
}