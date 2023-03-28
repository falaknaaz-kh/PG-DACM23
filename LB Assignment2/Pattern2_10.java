class Pattern2_10
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 5;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = k; j > 1; j--)
			{
				System.out.print(" ");
				
			}
			k--;
			for(j = 1; j <= 5; j++)
			{
				System.out.print("*");
			}
				
			System.out.println();
		}
	}
}

/*

    *****
   *****
  *****
 *****
*****

*/