class Pattern1_16
{
	public static void main(String args[])
	{
		int i, j;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print((6 - j) + " ");
			}
			System.out.println();
		}
	}
}

/*

5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

*/