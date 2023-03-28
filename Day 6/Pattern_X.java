class Pattern_X
{
	public static void main(String args[])
	{
		int i, j, k = 5;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= i; j++)
			{	
				if(j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(j = k; j > 1; j--)
				System.out.print("  ");
	
			k--;
			
			for(j = 1; j <= i; j++)
			{	
				if(j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();	
		}
		
		k = 5;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
	
			k--;
			
			for(j = 1; j <= i; j++)
			{	
				if(j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(j = 1; j <= i; j++)
			{	
				if(j== i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*

*        *
 *      *
  *    *
   *  *
    **
    **
   *  *
  *    *
 *      *
*        *

*/