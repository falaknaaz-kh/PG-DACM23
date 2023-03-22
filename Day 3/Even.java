import java.util.Scanner;

class Even
{
	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print(num + " is " + (num % 2 == 0 ? "even" : "odd") + " number.");
	}
}	
		