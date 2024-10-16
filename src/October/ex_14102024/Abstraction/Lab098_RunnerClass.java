package October.ex_14102024.Abstraction;

public class Lab098_RunnerClass {
    public static void main(String[] args) {
        ChromeTCs obj1=new ChromeTCs();
        obj1.openBrower("chrome");
        obj1.closeBrower("chrome");
        obj1.takeScreenShots();
        FireFoxtcs obj2=new FireFoxtcs();
        obj2.openBrower("firefox");
        obj2.closeBrower("firefox");
        obj2.takeScreenShots();
    }
}
