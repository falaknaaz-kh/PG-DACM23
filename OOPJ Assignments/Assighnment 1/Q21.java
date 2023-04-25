class Q21 {
   public static void main(String[] args) {
       /**
        * To convert state of Long instance into byte,short, int, long, float and double.
        */

       long sho = 2;
       Long sh = new Long(sho);

       System.out.println("Long instance into byte is " +sh.byteValue() ); 

       //The number of bytes used to represent a char value.
       System.out.println("The state of Long instance into int is " + sh.intValue()); 

       //The minimum value a char can store.
       System.out.println("The state of Long instance into long is " + sh.longValue()); 

       //The maximum value a char can store.
       System.out.println("The state of Long instance into float is " + sh.floatValue());  

       System.out.println("The state of Long instance into double is " + sh.doubleValue());  
   }

}
