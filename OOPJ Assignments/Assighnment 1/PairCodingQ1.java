import java.util.Scanner;
class PairCodingQ1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 10 and 1000: ");
        int num = sc.nextInt();
        int sum = 0;
        int mod = 0;

        if(num >= 10 && num <= 1000){

            while(num != 0)
            {
                mod = num % 10;
                sum = sum + mod;
                num = num / 10;
            }
            System.out.println("The sum of digits = " + sum);

        }
        else
            System.out.println("The number entered is not valid.");
    }

}