class Pattern4_4
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 6;
		
		for(i = 1; i <= 6; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
				
			k--;
			for(j = 1; j <= i; j++)
				System.out.print("* ");
				
			System.out.println();
		}
	}
}

/*

     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/