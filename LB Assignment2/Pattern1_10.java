class Pattern1_10
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
	
			for(j = 0; j < i; j++)
			{
				a = (char)(64 + k + j);
				System.out.print(a + " ");
			}
			
			k--;	
			System.out.println();
		}
	}
}

/*

    E
   D E
  C D E
 B C D E
A B C D E

*/