import java.util.Scanner;

class A1Q15_LCM
{
	public static void main(String args[])
	{
		System.out.print("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int gcd = 1;
		
		for(int i = 1; i <= num1 && i <= num2; i++)
		{
			if(num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		
		int lcm = (num1 * num2) / gcd;
		
		System.out.print("LCM of " + num1 + " and " + num2 + " is " + lcm);
	}
}