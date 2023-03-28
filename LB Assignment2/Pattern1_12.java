class Pattern1_12
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 5;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
			
			for(j = 1; j <= i; j++)
				System.out.print(i + " ");
			
			k--;
			System.out.println();
		}
	}
}

/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/