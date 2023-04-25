import java.util.Scanner;

class Q30 {
   public static void main(String[] args) {
      
      /**
      * To find minimum and maximum number as well as to add two double numbers using methods of Double.
      */
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two double numbers : ");
      double num1 = sc.nextDouble();
      double num2 = sc.nextDouble();

      System.out.println("The maximum number is " + Double.max(num1, num2));
      System.out.println("The minimum number is " + Double.min(num1, num2));
      System.out.println("The sum of two numbers is " + Double.sum(num1, num2));

      sc.close();
 
    }

}