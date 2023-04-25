import java.util.Scanner;

class PairCodingQ2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];

        for(int i = 0; i <= (n-1); i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();
        int max = arr[0];
        int index = 0;
        System.out.print("The " + k + " maximum numbers in array are: ");

        for(int i = 1; i <= k; i++)
        {
        
            for(int j = 0; j <= (n-1); j++)
            {
                if(arr[j] > max)
                {
                    max = arr[j];
                    index = j;
                }
            }
            System.out.println(max + "  ");
            arr[index] = 0;
            max = 0;
        }

    }
}

