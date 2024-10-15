package October.ex_11102024.SuperExampleConstructorChaining;

public class BaseClass {

    private String browser;
    BaseClass()
    {
        System.out.println(" DC-BaseClass");
    }
    BaseClass(String b)
    {
        System.out.println(" CC-BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean auth) {
        if (auth == true) {
            this.browser = browser;
        }
        else {
            System.out.println("not allowed");
        }
    }

    public void openBrowse()
    {
        System.out.println(" Chrome browser open  by default");
    }

    public void openBrowse(String browerName)
    {
        System.out.println(" open browser!!!!!"+browerName);
    }
    public void closeBrowse()
    {
        System.out.println(" Close browser");
    }
}
