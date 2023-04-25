class Q24 {
   public static void main(String[] args) {
       /**
        * To convert:
               a. float value into String
               b. float value into Float instance.
               c. String instance into Float instance.
               d. float value into hexadecimal string.

        */
      float by = 12.23f;
      String str = Float.toString(by);
      System.out.println("Long value into String is " + str);

      Float byt = new Float(by);
      System.out.println("Long value into Long instance. is " + byt);
      String strs = new String(str);
      Float b = new Float(strs);
      System.out.println("String instance into Long instance is " + b);  

      System.out.println("Long value into hexadecimal string is " +  Float.toHexString(by));   
   }

}
