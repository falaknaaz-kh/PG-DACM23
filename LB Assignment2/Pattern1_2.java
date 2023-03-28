class Pattern1_2
{
	public static void main(String args[])
	{
		int i, j;
		char a = 0;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= i; j++)
			{
				a = (char)(64 + j);
				System.out.print(a + " ");
			}
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