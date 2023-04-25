class Q11 {
    public static void main(String[] args) {
        /**
         * To extract character:
                a. Check whether entered character is letter or digit. If it
                is digit then print its values as well as code point.
                b. If it is character then check whether it is in lowercase?
                If it is in lowercase then convert it into upper case and
                print it well as its code point. If it is in uppercase
                Core Java Assignment 1
                Designed by Sandeep Kulange
                then convert it into lower case and print it well as its
                code point.

         */

        char ch = args[0].charAt(0);

        if(Character.isDigit(ch))
            System.out.println("Char is digit. " + ch + " " + (int)ch);  
        else if(Character.isLowerCase(ch))
            System.out.println("Char is lower case letter. " + Character.toUpperCase(ch) + " " + (int)ch);
        else
            System.out.println("Char is upper case letter. " + Character.toLowerCase(ch) + " " + (int)ch);

    }
}
