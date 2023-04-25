package assign3;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static void sortInAscendingOrder(int[] arr) {
		Arrays.sort(arr);
		System.out.println("The sorted array :");
		Q1.displayArray(arr);
	}

	private static void smallestElementInArray(int[] arr) {
		System.out.println("The smallest element of array is " + arr[0]);
	}

	private static void largestElementInArray(int[] arr) {
		System.out.println("The largest element of array is " + arr[arr.length - 1]);
	}

	private static void averageOfArray(int[] arr) {
		double avg = Q1.sumOfArray(arr) / arr.length;
		System.out.println("Averange of array = " + avg);
	}

	private static int sumOfArray(int[] arr) {
		int sum = 0;
		for(int element : arr) {
			sum += element;
		}
		System.out.println("Sum of the elements = " + sum);
		return sum;
	}

	private static void displayArray(int[] arr) {
		System.out.print("Array: "+ Arrays.toString(arr));
	}

	private static void acceptArray(int[] arr) {

		System.out.println("Enter the elementes of array: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter element: ");
			arr[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		Q1.acceptArray(arr);
		Q1.displayArray(arr);
		Q1.sumOfArray(arr);
		Q1.averageOfArray(arr);
		Q1.sortInAscendingOrder(arr);
		Q1.largestElementInArray(arr);
		Q1.smallestElementInArray(arr);
	}
}
