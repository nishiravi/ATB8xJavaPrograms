package October.ex_09102024.Inheritence.Multilevel;

public class Lab089_TestRun {
    public static void main(String[] args) {
        // creating child object we can access child methods,parent methods and grand parent methods as the parent class extends grand parent class
        Lab088_Child childobj=new Lab088_Child();
        childobj.parent();
        childobj.child();
        childobj.grandParent();
    }
}
