class Pattern1_7
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 5;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
				
			k--;
			for(j = 1; j <= i; j++)
				System.out.print(j + " ");
				
			System.out.println();
		}
	}
}

/*

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/