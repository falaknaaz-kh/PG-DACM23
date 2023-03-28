import java.io.*;
 
class Demo {
    int x = 10;
    int display()
    {
        System.out.println("HI x = " + x);
        return 0;
    }
}
 
class Main {
    public static void main(String[] args)
    {
        Demo D1 = new Demo(); // point 1

 
        D1.display(); // point 3
    }
}