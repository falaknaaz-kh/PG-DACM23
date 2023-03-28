class Pattern4_6
{
	public static void main(String args[])
	{
		int i, j, k = 6;
		
		for(i = 1; i <= 6; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
				
			k--;
			
			for(j = 1; j <= i; j++)
			{	
				if((j == 1) || (j== i) || (i == 6))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*

     *
    * *
   *   *
  *     *
 *       *
* * * * * *

*/