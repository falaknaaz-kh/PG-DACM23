class Q16 {
    public static void main(String[] args) {
        /**
         * To convert:
                a. int value into String
                b. int value into Integer instance.
                c. String instance into Integer instance.
                d. int value into binary, octal and hexadecimal string.
         */
        int by = 12;
        String str = Integer.toString(by);
        System.out.println("Integer value into String is " + str);  //"2"

        Integer byt = new Integer(by);
        System.out.println("Integer value into Integer instance. is " + byt);

        Integer b = new Integer(str);
        System.out.println("String instance into Integer instance is " + b);  

        System.out.println("Int value into binary string is " +  Integer.toBinaryString(by));  
        System.out.println("Int value into octal string is " +  Integer.toOctalString(by));  
        System.out.println("Int value into hexadecimal string is " +  Integer.toHexString(by));   
    }

}