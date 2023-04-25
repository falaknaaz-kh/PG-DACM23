class Q13 {
    public static void main(String[] args) {
        /**
         * To convert:
                a. short value into String
                b. short value into Short instance.
                c. String instance into Short instance.
         */
        short by = 2;
        String str = Short.toString(by);
        System.out.println("Short value into String is " + str);  //"2"

        Short byt = new Short(by);
        System.out.println("Short value into Short instance. is " + byt);  
        Short b = new Short(str);
        System.out.println("String instance into Short instance is " + b);  

    }

}