import java.util.Scanner;
class PairCodingQ3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int min = sc.nextInt();
        int year = min / 525600;
        int day = min / 1440;

        System.out.println("Years = " + year);
        System.out.println("Days = " + day);

    }

}