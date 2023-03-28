class Pattern1_18
{
	public static void main(String args[])
	{
		int i, j;
		char a = 0;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= (6 - i) ; j++)
			{
				a = (char)(64 + j);
				System.out.print(a + " ");
			}	
			System.out.println();
		}
	}
}

/*

A B C D E
A B C D
A B C
A B
A

*/