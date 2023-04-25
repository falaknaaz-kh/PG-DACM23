class Q8 {
    public static void main(String[] args) {
        /**
         * To convert byte value into String
         */
        byte by = 2;
        String str = Byte.toString(by);
        System.out.println("Byte value into String is " + str);  //"2"

        Byte byt = new Byte(by);
        System.out.println("Byte value into Byte instance is " + byt);  

    }

}