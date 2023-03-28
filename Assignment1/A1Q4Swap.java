import java.util.Scanner;

class A1Q4Swap
{
	public static void main(String args[])
	{
		System.out.print("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = sc.nextInt();
		
		System.out.print("b = ");
		int b = sc.nextInt();
		
		int swap = a;
		a = b;
		b = swap;
		
		System.out.print("After swapping: a = " + a + " b = " + b);
	}
}

		