import java.util.Scanner;

class A1Q11_SmallestNum
{
	public static void main(String args[])
	{
		System.out.print("Enter three numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("Smallest numnber is " + min);
	}
}	
		