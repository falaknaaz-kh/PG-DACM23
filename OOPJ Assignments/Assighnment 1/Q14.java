class Q14 {
    public static void main(String[] args) {
        /**
         * To convert state of Short instance into byte,short, int, long, float and double
         */

        Short sho = 2;
        Short sh = new Short(sho);

        System.out.println(" Short instance into byte is " +sh.byteValue() );  

        //The number of bytes used to represent a char value.
        System.out.println("The state of Short instance into int is " + sh.intValue());  

        //The minimum value a char can store.
        System.out.println("The state of Short instance into long is " + sh.longValue());  

        //The maximum value a char can store.
        System.out.println("The state of Short instance into float is " + sh.floatValue());  

        System.out.println("The state of Short instance into double is " + sh.doubleValue());  
    }

}