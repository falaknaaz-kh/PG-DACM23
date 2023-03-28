class Pattern1_9
{
	public static void main(String args[])
	{
		int i, j, k;
		k = 5;
		char a = 0;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
	
			for(j = 1; j <= i; j++)
			{
				a = (char)(64 + j);
				System.out.print(a + " ");
			}	
			k--;	
			System.out.println();
		}
	}
}

/*

    A
   A B
  A B C
 A B C D
A B C D E

*/