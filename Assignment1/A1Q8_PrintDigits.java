import java.util.Scanner;

class A1Q8_PrintDigits
{
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int digit;
		while( num != 0)
		{
			digit = num % 10;
			System.out.println(digit);
			num = num / 10;
		}
	}
}