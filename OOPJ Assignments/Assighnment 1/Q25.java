class Q25 {
   public static void main(String[] args) {
       /**
        * To convert state of Float instance into byte,short, int, long, float and double.
        */

      float sho = 2;
      Float sh = new Float(sho);

      System.out.println("Float instance into byte is " +sh.byteValue() ); 

      System.out.println("The state of Float instance into int is " + sh.intValue()); 

      System.out.println("The state of Float instance into long is " + sh.longValue()); 

      System.out.println("The state of Float instance into float is " + sh.floatValue());  

      System.out.println("The state of Float instance into double is " + sh.doubleValue());  
   }

}
