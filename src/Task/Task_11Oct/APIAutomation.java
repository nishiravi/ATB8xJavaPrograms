package Task.Task_11Oct;

public class APIAutomation {
    public static void main(String[] args) {

        BaseTestAPI obj=new TestCaseAPI(); // Dynamic Dispatch
        obj.setId(1);
        obj.setName("nishi",true);
    }
}
