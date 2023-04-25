import java.util.Scanner;

class Q18 {
   public static void main(String[] args) {
      
      /**
      * To find minimum and maximum number as well as to add two integer numbers
       using methods of Integer.

      */
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two integer numbers : ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      System.out.println("The maximum number is " + Integer.max(num1, num2));
      System.out.println("The minimum number is " + Integer.min(num1, num2));
      System.out.println("The sum of two numbers is " + Math.addExact(num1, num2));

      sc.close();
 
    }

}