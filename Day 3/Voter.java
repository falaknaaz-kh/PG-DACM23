import java.util.Scanner;

class Voter
{
	public static void main(String args[])
	{
		System.out.print("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		System.out.print("Are you an Indian? (Enter '1' for yes and '0' for no): ");
		int ind = sc.nextInt();
		
		System.out.print("You are " + (((age >= 18) && (ind == 1)) ? "elegible" : "not elegible") + " to vote.");
		
	}
}	