package October.ex_16102024.Enum;

public class Lab104 {
    public static void main(String[] args) {
 System.out.println(APIConstantsEndpoints.CHATBOT_PAGE.getValue());
 System.out.println("another enum"+APIConstantsEndpoints1.BASE_URL.getValue1());
    }
}
 enum APIConstantsEndpoints1 {
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");


    private String name;

    APIConstantsEndpoints1(String name) {
        this.name = name;
    }

    String getValue1() {
        return name;
    }
}

