import java.util.Scanner;

class DateTime{

    int day;
    int month;
    int year;
    int hrs;
    int min;
    int sec;

    void acceptDateTime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days : ");
        day = sc.nextInt();
        System.out.print("Enter month : ");
        month = sc.nextInt();
        System.out.print("Enter year : ");
        year = sc.nextInt();
        System.out.print("Enter Hours : ");
        hrs = sc.nextInt();
        System.out.print("Enter minutes : ");
        min = sc.nextInt();
        System.out.print("Enter seconds : ");
        sec = sc.nextInt();
        sc.close();

    }

    void printDateTime(){
        System.out.println("DATE :" + this.day + "/" + this.month + "/" + this.year);
        System.out.println("TIME :" + this.hrs + ":" + this.min + ":" + this.sec);
    }

}

class Q1{
    public static void main(String args[]){
        DateTime dt = new DateTime();

        dt.acceptDateTime();
        dt.printDateTime();

    }
}