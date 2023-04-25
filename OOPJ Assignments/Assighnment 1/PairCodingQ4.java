import java.util.Scanner;

class DistTime{

    float dist;
    int hrs;
    int min;
    int sec;
    double speed;

    void accept(){
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (in meters): ");
        float dist = sc.nextFloat();

        System.out.print("Enter time: ");
        System.out.print("Hours: ");
        int hrs = sc.nextInt();

        System.out.print("Minutes: ");
        int min = sc.nextInt();

        System.out.print("Seconds: ");
        int sec = sc.nextInt();
    }

    void calculatePrint(){
        speed = dist / sec + (hrs * 3600) + (min * 60);
        System.out.println("Speed in meters per second: " + speed);
        System.out.println("Speed in kilometers per hour: " + (speed * 3.6));
        System.out.println("Speed in miles per hour: " + (speed * 2.23693));
    }
}

class PairCodingQ4{
    public static void main(String[] args) {

        DistTime dt = new DistTime();
        dt.accept();
        dt.calculatePrint();
    }

}
