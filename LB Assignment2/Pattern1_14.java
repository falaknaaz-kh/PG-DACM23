class Pattern1_14
{
	public static void main(String args[])
	{
		int i, j;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= (6 - i) ; j++)
				System.out.print(j + " ");
				
			System.out.println();
		}
	}
}

/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/