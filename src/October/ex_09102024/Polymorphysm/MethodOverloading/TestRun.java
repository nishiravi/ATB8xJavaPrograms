package October.ex_09102024.Polymorphysm.MethodOverloading;

public class TestRun {
    public static void main(String[] args) {

        Parent objParent=new Parent();
        Child objChild=new Child();
        //Method house overloaded with different arguments being passed
        objParent.house();
        objChild.house("Nishi Child");
        objChild.house("nishi",2);
        // called as Dynamic Dispatch
        Parent obj1=new Child();

        //Child obj2=new Parent(); -NA parent cannot be created and assigned to a child
    }


}