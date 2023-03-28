import java.util.Scanner;

class A1Q12_Add2Numbers
{
	public static void main(String args[])
	{
		System.out.print("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 1; i <= b; i++)
		{
			a++;
		}
		
		System.out.print("Sum = " + a);
	}
}