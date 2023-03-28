import java.util.Scanner;

class A1Q9_Factors
{
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print("The factors of " + num + " are: ");
		
		for(int i = 1; i < num; i++)
		{
			if(num % i == 0)
				System.out.print(i + ", ");
		}
	}
}