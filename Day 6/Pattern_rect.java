class Pattern_rect
{
	public static void main(String args[])
	{
		int i, j, k = 4;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 5; j >= i; j--)
				System.out.print("* ");

			for(j = 2; j <= i; j++)
				System.out.print("    ");
			
			for(j = 5; j >= i; j--)
				System.out.print("* ");
			
			System.out.println();
		}
				
		for(i = 2; i <= 5; i++)
		{
			for(j = 1; j <= i; j++)
				System.out.print("* ");
	
			for(j = k; j > 1; j--)
				System.out.print("    ");
				
			k--;
			for(j = 1; j <= i; j++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
}

/*

* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *

*/