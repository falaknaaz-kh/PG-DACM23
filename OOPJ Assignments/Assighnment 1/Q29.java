class Q29 {
   public static void main(String[] args) {
       /**
        * To convert state of Double instance into byte,short, int, long, float and double.
        */

      double sho = 2;
      Double sh = new Double(sho);

      System.out.println("Double instance into byte is " +sh.byteValue() ); 

      System.out.println("The state of Double instance into int is " + sh.intValue()); 

      System.out.println("The state of Double instance into long is " + sh.longValue()); 

      System.out.println("The state of Double instance into float is " + sh.floatValue());  

      System.out.println("The state of Double instance into double is " + sh.doubleValue());  
   }

}
