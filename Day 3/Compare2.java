import java.util.Scanner;

class Compare2
{
	public static void main(String args[])
	{
		System.out.print("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = num1 > num2 ? (num1 + num2) : (num2 - num1);
		System.out.print("Result = " + result);
	}
}	