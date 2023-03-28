class Pattern1_8
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 5;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
	
			for(j = 0; j < i; j++)
				System.out.print(k + j +" ");
				
			k--;	
			System.out.println();
		}
	}
}

/*

    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/