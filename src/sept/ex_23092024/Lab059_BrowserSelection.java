package sept.ex_23092024;

public class Lab059_BrowserSelection {
    public static void main(String[] args) {

        String browser="edge";
        switch (browser){
            case "chrome":
                System.out.println("Code executed in Chrome Browser  ");
                break;
                // Selenium code to intialize the driver and open the browser
            case "firefox":
                System.out.println("Code executed in FireFox Browser  ");
                break;
            // Selenium code to intialize the driver and open the browser
            case "edge":
                System.out.println("Code executed in Edge Browser  ");
                break;
            // Selenium code to intialize the driver and open the browser
            default:
                System.out.println(" browser does not  exist");
        }
    }
}
