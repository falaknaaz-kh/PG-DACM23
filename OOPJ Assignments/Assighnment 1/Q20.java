class Q20 {
   public static void main(String[] args) {
       /**
        * To convert:
               a. long value into String
               b. long value into Long instance.
               c. String instance into Long instance.
               d. long value into binary, octal and hexadecimal string.
        */
       long by = 12234534;
       String str = Long.toString(by);
       System.out.println("Long value into String is " + str);

       Long byt = new Long(by);
       System.out.println("Long value into Long instance. is " + byt);

       Long b = new Long(str);
       System.out.println("String instance into Long instance is " + b);  

       System.out.println("Int value into binary string is " +  Long.toBinaryString(by));  
       System.out.println("Int value into octal string is " +  Long.toOctalString(by));  
       System.out.println("Int value into hexadecimal string is " +  Long.toHexString(by));   
   }

}
