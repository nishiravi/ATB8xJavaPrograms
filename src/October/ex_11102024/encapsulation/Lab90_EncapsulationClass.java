package October.ex_11102024.encapsulation;

public class Lab90_EncapsulationClass {

    private String  userName;
    private String passWord;


    Lab90_EncapsulationClass(String userName, String passWord)
    {
        this.userName=userName;
        this.passWord=passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
