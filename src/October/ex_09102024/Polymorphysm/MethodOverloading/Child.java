package October.ex_09102024.Polymorphysm.MethodOverloading;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Child extends Parent {
    // house method of parent class is overloaded
    void house(String child){

        System.out.print(child);
    }
    void house(String owner,int bedrooms)
    {
        System.out.print(" owner is "+owner);
        System.out.print(" bedrooms are "+bedrooms);
    }
}
