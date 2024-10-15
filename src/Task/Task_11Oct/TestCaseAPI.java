package Task.Task_11Oct;

public class TestCaseAPI extends BaseTestAPI{ // single Inheritence

    TestCaseAPI()
    {
        super(); // calling parent constructors and methods
        super.performGet();
        super.performPost();
        super.performPatch();
        super.performPut();
        super.performDelete();
        this.performDelete("testuser1"); // calling the method of child using this operator
    System.out.println(" DC of child constructor");

    }
    //Method overriding
    @Override
    public void setName(String name, boolean auth) {
        super.setName(name,auth);
    }
    @Override   public void setId(int id) {
        super.setId(id);

    }
    // Method Overloading
    public void performDelete(String name)
    {
        System.out.println(" DElete-Delete the data of user " +name);
    }


    }

