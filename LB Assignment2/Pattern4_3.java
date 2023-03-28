class Pattern4_3
{
	public static void main(String args[])
	{
		int i, j;
		
		for(i = 1; i <= 6; i++)
		{
			for(j = 6; j >= i; j--)
			{	
				if((j == 6) || (j == i) || (i == 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*

******
*   *
*  *
* *
**
*

*/