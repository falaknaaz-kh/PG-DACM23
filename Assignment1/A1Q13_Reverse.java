import java.util.Scanner;

class A1Q13_Reverse
{
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int reverse = 0;
		
		while( num != 0)
		{
			reverse = reverse * 10 + (num % 10);
			num = num / 10;
		}
		
		System.out.print("Reverse: " + reverse);
	}
}