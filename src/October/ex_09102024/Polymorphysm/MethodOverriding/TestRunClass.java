package October.ex_09102024.Polymorphysm.MethodOverriding;

import October.ex_09102024.Polymorphysm.MethodOverloading.Child;
import October.ex_09102024.Polymorphysm.MethodOverloading.Parent;

public class TestRunClass {
    public static void main(String[] args) {

        ParentTest objParent=new ParentTest();
        ChildTest objChild=new ChildTest();
        //Method house overloaded with different arguments being passed
        objParent.house();
        objParent.house("Parent",3);
        objChild.house("Nishi Child");
        objChild.house("nishi",2);
        // called as Dynamic Dispatch
        Parent obj1=new Child();

        //Child obj2=new Parent(); -NA parent cannot be created and assigned to a child
    }


}