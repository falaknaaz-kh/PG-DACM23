class Pattern2_5
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 5;
		
		for(i = 1; i <= 9; i += 2)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
				
			k--;
			for(j = 1; j <= i; j++)
				System.out.print("*");
				
			System.out.println();
		}
	}
}

/*

    *
   ***
  *****
 *******
*********

*/