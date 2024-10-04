package October.ex_04102024.Constructor;

import October.ex_04102024.AHuman;

public class Lab083_CallConstructors {
    public static void main(String[] args) {

        // object created with refrence variable obj1,constructor with single argument
        AHuman1 obj1=new AHuman1("nishi");
        // object created with refrence variable obj2,constructor with 2 argument
        AHuman1 obj2=new AHuman1("nishi123","black");
        // default constructor is called
        new AHuman1(); // object created
       // System.out.println(obj1.name+ " of obj1");
        //System.out.println(obj2.name+ " of obj2");

    }
}
