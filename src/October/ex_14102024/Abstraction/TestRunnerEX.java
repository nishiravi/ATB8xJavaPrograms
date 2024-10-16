package October.ex_14102024.Abstraction;

public class TestRunnerEX {
    public static void main(String[] args) {
        TestClassEx obj=new TestClassEx();
        obj.openBrowser();
        obj.openBrowser();
        obj.takeScreenshort("chrome");
    }
}
