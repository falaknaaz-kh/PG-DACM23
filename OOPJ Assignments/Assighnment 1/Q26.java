import java.util.Scanner;

class Q26 {
   public static void main(String[] args) {
      
      /**
      * To find minimum and maximum number as well as to add two float numbers using methods of Float.
      */
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two float numbers : ");
      float num1 = sc.nextFloat();
      float num2 = sc.nextFloat();

      System.out.println("The maximum number is " + Float.max(num1, num2));
      System.out.println("The minimum number is " + Float.min(num1, num2));
      System.out.println("The sum of two numbers is " + Float.sum(num1, num2));

      sc.close();
 
    }

}