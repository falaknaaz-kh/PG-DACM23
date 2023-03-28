class Pattern3_1
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 9;
		
		for(i = 1; i <= 9; i++)
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
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9

*/