class Pattern2_9
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
				System.out.print("*");
				
			System.out.println();
		}
		
		for(i = 1; i <= 4; i++)
		{
			for(j = 1; j <= i; j++)
				System.out.print(" ");
			
			for(j = 4; j >= i; j--)
				System.out.print("*");
			
			System.out.println();
		}
	}
}

/*

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

*/