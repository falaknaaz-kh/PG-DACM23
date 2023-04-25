class Q23 {
    public static void main(String[] args) {
        /**
         * The number of bits used to represent a float value.
         */
        System.out.println("The number of bits used to represent a float value is " + Float.SIZE);  //32

        //The number of bytes used to represent a float value.
        System.out.println("The number of bytes used to represent a float value is " + Float.BYTES);  //4

        //The minimum value a float can store.
        System.out.println("The minimum value a float variable can store is " + Float.MIN_VALUE);  //1.4E-45

        //The maximum value a float can store.
        System.out.println("The maximum value a float variable can store is " + Float.MAX_VALUE);  //3.4028235E38

    }

}