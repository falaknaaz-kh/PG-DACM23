import java.util.Scanner;

class A1Q5_PositiveOrNegative
{
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if( num >= 0 )
			System.out.print(num + " is a positive number.");
		else
			System.out.print(num + " is a negative number.");
	}
}