class Q17 {
   public static void main(String[] args) {
       /**
        * To convert state of Integer instance into byte,short, int, long, float and double
        */

       int sho = 2;
       Integer sh = new Integer(sho);

       System.out.println(" Integer instance into byte is " +sh.byteValue() );  

       //The number of bytes used to represent a char value.
       System.out.println("The state of Integer instance into int is " + sh.intValue()); 

       //The minimum value a char can store.
       System.out.println("The state of Integer instance into long is " + sh.longValue()); 

       //The maximum value a char can store.
       System.out.println("The state of Integer instance into float is " + sh.floatValue());  

       System.out.println("The state of Integer instance into double is " + sh.doubleValue());  
   }

}