import java.util.Scanner;

class Q22 {
   public static void main(String[] args) {
      
      /**
      * To find minimum and maximum number as well as to add two long numbers
       using methods of long.

      */
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two long numbers : ");
      long num1 = sc.nextLong();
      long num2 = sc.nextLong();

      System.out.println("The maximum number is " + Long.max(num1, num2));
      System.out.println("The minimum number is " + Long.min(num1, num2));
      System.out.println("The sum of two numbers is " + (num1 + num2));

      sc.close();
 
    }

}