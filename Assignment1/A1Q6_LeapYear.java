import java.util.Scanner;

class A1Q6_LeapYear
{
	public static void main(String args[])
	{
		System.out.print("Enter a year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.print(year + " is a leap year.");
		else
			System.out.print(year + " is not a leap year.");
	}
}