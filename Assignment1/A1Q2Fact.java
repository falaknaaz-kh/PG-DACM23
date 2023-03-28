import java.util.Scanner;

class A1Q2Fact
{
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		long fact = 1L;
		
		for(int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial: " +fact);
	}
}