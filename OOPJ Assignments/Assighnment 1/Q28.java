class Q28 {
   public static void main(String[] args) {
       /**
        * To convert:
               a. double value into String
               b. double value into Double instance.
               c. String instance into Double instance.
               d. double value into binary, octal and hexadecimal string
         (Note: Here you can use doubleToLongBits() method along with methods of Long class).
        */
      double by = 12.23;
      String str = Double.toString(by);
      System.out.println("Double value into String is " + str);

      Double byt = new Double(by);
      System.out.println("Double value into Double instance. is " + byt);
      String strs = new String(str);
      Float b = new Float(strs);
      System.out.println("String instance into Double instance is " + b);  

      System.out.println("Double value into binary string is " +  Long.toBinaryString(Double.doubleToLongBits(by)));  
      System.out.println("Double value into octal string is " +  Float.toOctalString(by));  
      System.out.println("Double value into hexadecimal string is " +  Double.toHexString(by));   
   }

}
