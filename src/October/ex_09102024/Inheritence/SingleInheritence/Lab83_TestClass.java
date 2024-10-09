package October.ex_09102024.Inheritence.SingleInheritence;

public class Lab83_TestClass {
    public static <Parentclass> void main(String[] args) {
        ParentClass parentObj=new ParentClass();
        ChildClass childObj=new ChildClass();
        parentObj.keyPassword=1235;
        System.out.println(" parent key passwor"+parentObj.keyPassword);
        parentObj.houseKey();
        childObj.keyPassword=1239;
        System.out.println(" child key passwor"+childObj.keyPassword);
        childObj.childkeyPassword=1239000;
        System.out.println(" child key passwor"+childObj.childkeyPassword);
        childObj.houseKey();


    }
}
