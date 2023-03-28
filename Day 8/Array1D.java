import java.util.Scanner;
class Array1D
{	
	static void print_arr(int arr[])
	{
		for(int ele : arr)
			System.out.print(ele + ", ");		
	}
	
	static void min(int arr[])
	{
		int min = arr[0];
		
		for(int ele : arr)
		{
			if(ele < min)
				min = ele;
		}
		
		System.out.println("Minimum element is " + min);
	}
	
    static void max(int arr[])
	{
		int max = 0;
		
		for(int ele : arr)
		{
			if(ele > max)
				max = ele;
		}
		
		System.out.println("Maximum element is " + max);
	}	
	
	static void search(int arr[], int element)
	{
		int i = 0;
		for(int ele : arr)
		{
			if(ele == element)
			{	
				System.out.println("Element found at position " + (i + 1));
				return;
			}
			i++;
		}
		
		System.out.println("Element not found in array.");
	}
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1, 2, 3, 4, 5};
		
		print_arr(arr);
		min(arr);
		max(arr);
		
		System.out.print("Enter element to search in array: ");
		int element = sc.nextInt();
		search(arr, element);
		
	}
}	