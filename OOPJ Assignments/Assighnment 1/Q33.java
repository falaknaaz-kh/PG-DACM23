import java.util.Scanner;

class Q33 {
   public static void main(String[] args) {
       /**
        To pass integer, float and double value from command line. Parse 
        it appropriately and perform arithmetic operations (+,-,*,/) on it. 
        Here we use switch case.
        */

      int i = Integer.parseInt(args[0]);
      float fl = Float.parseFloat(args[1]);
      double d = Double.parseDouble(args[2]);

      Scanner sc = new Scanner(System.in);
      System.out.println("1.Addition");
      System.out.println("2.Subtraction");
      System.out.println("3.Multiplication");
      System.out.println("4.Division");
      System.out.print("Enter choice: ");
      
      switch (sc.nextInt()) {
         case 1:
            System.out.println("The sum of integer, float and double value is " + (i+fl+d)); 
            break;
         case 2:
            System.out.println("The subtraction of integer, float and double value is " + (i-fl-d)); 
            break;
         case 3:
            System.out.println("The multiplication of integer, float and double value  is " + (i*fl*d));
            break;
         case 4:
            System.out.println("The division of integer, float and double value  is " + (i/fl/d)); 
            break;   
      
         default:
            System.out.println("Wrong Input");
            break;
      }
      sc.close();

   }

}