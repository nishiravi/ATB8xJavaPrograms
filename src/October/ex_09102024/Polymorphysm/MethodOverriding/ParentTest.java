package October.ex_09102024.Polymorphysm.MethodOverriding;

public class ParentTest {

    void house(){
        System.out.println(" parent house");
    }
    void house(String owner,int bedrooms)
    {
        System.out.println(" owner is "+owner);
        System.out.println(" bedrooms are "+bedrooms);
    }
}
