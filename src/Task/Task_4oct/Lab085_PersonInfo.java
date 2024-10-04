package Task.Task_4oct;

public class Lab085_PersonInfo {
    public static void main(String[] args) {
        Lab084_Person obj1=new Lab084_Person();
        Lab084_Person obj2=new Lab084_Person("name2","female",1,"13061 elm","herndon","virginia",123456,"USA");
        Lab084_Person obj3=new Lab084_Person("name3","male",12,"13062 elm","herndon","virgnia",2045,"USA");
        Lab084_Person obj4=new Lab084_Person("name4","female",14,"13063 elm","herndon","vginia",255,"USA");
        Lab084_Person obj5=new Lab084_Person("name5","male",15,"13064 elm","herndon","vinia",215,"USA");
        obj2.personalDetail();
        obj2.citizen();
        obj3.personalDetail();
        boolean ishuman=obj3.isHuman();
        System.out.println(" obj3 is human   "+ishuman);
        obj4.personalDetail();
        obj4.personaladdress();
        obj5.personalDetail();

    }
}
