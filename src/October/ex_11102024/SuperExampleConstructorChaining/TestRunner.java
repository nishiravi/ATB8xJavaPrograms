package October.ex_11102024.SuperExampleConstructorChaining;

public class TestRunner {
    public static void main(String[] args) {
        BaseClass a=new TestClass(); // Dynamic Dispath
        a.openBrowse();
        a.openBrowse("edge");
       a.closeBrowse();
    }
}
