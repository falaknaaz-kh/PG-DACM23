class Q9 {
    public static void main(String[] args) {
        /**
         * To convert state of Byte instance into byte,short, int, long, float and double.
         */
        byte b = 1;
        Byte byt = new Byte(b);

        byte by = byt;
        short sh = byt;
        int in = byt;
        long lg = byt;
        float fl = byt;
        double db = byt;

        System.out.println(by);  
        System.out.println(sh);  
        System.out.println(in);  
        System.out.println(lg);  
        System.out.println(fl);  
        System.out.println(db);  

    }

}