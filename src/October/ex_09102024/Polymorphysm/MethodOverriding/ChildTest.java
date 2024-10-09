package October.ex_09102024.Polymorphysm.MethodOverriding;

public class ChildTest extends ParentTest {
    // house method of parent class is overloaded
    void house(String child){

        System.out.print(child);
    }
    @Override
    void house(String owner,int bedrooms)
    {
        System.out.println("  child owner is "+owner);
        System.out.println(" child bedrooms are "+bedrooms);
    }
    @Override
    void house()
    {
        System.out.println(" house method overriden by child");
    }
}
