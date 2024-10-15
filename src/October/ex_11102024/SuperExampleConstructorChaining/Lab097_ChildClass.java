package October.ex_11102024.SuperExampleConstructorChaining;

public class Lab097_ChildClass extends Lab097_ParentSuperClass {
    int variable=10;
    Lab097_ChildClass()
    {
       super();
        super.function();
        System.out.println("parent variable value is "+super.variable);
       System.out.println(" child constructor ");
       this.function();
        System.out.println("child variable value is "+this.variable);
    }

    public void function()
    {


        System.out.println(" child function");

    }

    public static void main(String[] args) {
        Lab097_ChildClass a= new Lab097_ChildClass();
    }
}
