import java.util.Scanner;

class Grade
{
	public static void main(String args[])
	{
		System.out.print("Enter your total marks obtained out of 800: ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		double percentage = marks / 8.0;
		System.out.println("Percentage : " + percentage + "%  ");
		
		if(percentage > 95)
			System.out.println("Grade : Distinction");
		
		else if(percentage >= 85)
			System.out.println("Grade : First Class");
		
		else if(percentage >= 75)
			System.out.println("Grade : Second Class");
			
		else if(percentage < 75)
			System.out.println("Grade : Average");
	}
}