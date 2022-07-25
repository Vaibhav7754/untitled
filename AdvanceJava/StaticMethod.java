package AdvanceJava;
// Example to illustrate Accessing
// the Static method(s) of the class.
import java.io.*;

class stat {

    public static String Name;

    public static void pname(String Name)
    {
        System.out.println(Name);
    }
}

public class StaticMethod {
    public static void main(String[] args)
    {

        // Accessing the static method geek()
        // and field by class name itself.
        stat.pname("vaibhav");


        // Accessing the static method geek()
        // by using Object's reference.
        stat obj = new stat();
        obj.pname("mohit");

    }
}



