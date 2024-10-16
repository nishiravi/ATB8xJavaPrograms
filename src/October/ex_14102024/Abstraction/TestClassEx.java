package October.ex_14102024.Abstraction;

public class TestClassEx extends BaseClassEx{
    @Override
    void openBrowser() {
        System.out.println("code to open browser ");
    }

    @Override
    void closeBrowser() {
        System.out.println("code to close browser ");
    }


    void takeScreenshort(String browser) {
        System.out.println(" take screenshot of browser"+browser);
    }
}
