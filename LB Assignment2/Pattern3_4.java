class Pattern3_4
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 9;
		
		for(i = 1; i <= 9; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print("  ");
				
			k--;
			for(j = 1; j <= i; j++)
				System.out.print(j + " ");
			
			for(j = 2; j <= i; j++)
				System.out.print(i - j + 1 + " ");
				
			System.out.println();
		}
		
	}
}

/*

                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

*/