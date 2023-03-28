class Pattern1_5
{
	public static void main(String args[])
	{
		int i, j;
		char a = 0;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= i; j++)
			{
				a = (char)(64 + i);
				System.out.print(a + " ");
			}
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