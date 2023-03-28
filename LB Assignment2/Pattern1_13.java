class Pattern1_13
{
	public static void main(String args[])
	{
		int i, j, k;
		char a = 0;
		k =5;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = k; j > 1; j--)
				System.out.print(" ");
			
			for(j = 1; j <= i; j++)
			{
				a = (char)(64 + i);
				System.out.print(a + " ");
			}
			k--;
			System.out.println();
		}
	}
}

/*
    A
   B B
  C C C
 D D D D
E E E E E
*/