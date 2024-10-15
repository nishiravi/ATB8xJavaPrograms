package October.ex_11102024.SuperExampleConstructorChaining;

public class TestClass extends BaseClass{
    TestClass()
    {
        super();
        this.setBrowser("edge",true);

    }
    @Override

    public void setBrowser(String browser,boolean auth) {
        super.setBrowser(browser,auth);
    }
}
