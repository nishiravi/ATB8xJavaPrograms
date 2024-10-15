package October.ex_11102024.encapsulation;

public class Lab91_TestEncpsulation {
    public static void main(String[] args) {
        Lab90_EncapsulationClass obj=new Lab90_EncapsulationClass("nishi","1234");
        System.out.println(obj.getPassWord());
        System.out.println(obj.getUserName());
        obj.setPassWord("NewUsername");
        System.out.println(obj.getUserName());
        obj.setPassWord("123456");
        System.out.println(obj.getPassWord());


    }
}
